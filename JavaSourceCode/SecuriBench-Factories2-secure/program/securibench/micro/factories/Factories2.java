/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Factories2.java,v 1.3 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.micro.factories;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="secure version of Factories2" 
 *  @servlet vuln_count="0" 
 *  */
public class Factories2 extends BasicTestCase implements MicroTestCase {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter("name");
        String s2 = s1.toString();
        String s3 = "abc".toString();
            
        PrintWriter writer = resp.getWriter();
        

        writer.println(s3);    /* OK */
    }
    
    public String getDescription() {
        return "secure version of Factories2";
    }

    public int getVulnerabilityCount() {
        return 0;
    }
}