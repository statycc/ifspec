/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Collections3.java,v 1.5 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.micro.collections;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description = "collection of collections" 
 *  @servlet vuln_count = "2" 
 *  NOTE: Previously, this source code contained a typo which made the program secure. This typo has been removed (see
 *  comment in respective line).
 *
 *  */
public class Collections3 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter(FIELD_NAME);
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.addLast(s1); // Previously: ll2.addLast(s1);
        ll2.addLast(ll1);
        
        LinkedList c = (LinkedList) ll2.getLast();
        String s2 = (String) c.getLast(); 
        
        PrintWriter writer = resp.getWriter();  
        writer.println(s2);                    /* BAD */
        // this is because the print out of c includes the test of s1
        writer.println(c);                     /* BAD */     
    }
    
    public String getDescription() {
        return "collection of collections";
    }
    
    public int getVulnerabilityCount() {
        return 2;
    }
}