/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Inter10.java,v 1.1 2006/04/21 17:14:26 livshits Exp $
 */
package securibench.micro.inter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="secure version of Inter10" 
 *  @servlet vuln_count="0" 
 *  */
public class Inter10 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter(FIELD_NAME);
        
        String s2 = foo(s1);
        String s3 = foo("abc");
        
        PrintWriter writer = resp.getWriter();  

        writer.println(s3);                    /* OK */
    }
    
    private String foo(String s1) {
		return s1.toLowerCase().substring(0, s1.length()-1);
	}
    
    public String getDescription() {
        return "secure version of Inter10";
    }
    
    public int getVulnerabilityCount() {
        return 0;
    }
}