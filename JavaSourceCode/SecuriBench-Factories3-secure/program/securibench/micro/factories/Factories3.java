/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Factories3.java,v 1.3 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.micro.factories;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="secure version of Factories3" 
 *  @servlet vuln_count="0" 
 *  */
public class Factories3 extends BasicTestCase implements MicroTestCase {
    class StringWrapper {
        StringWrapper(String value){
            this.value = value;
        }
        public String toString() {
            return value;
        }
        
        protected String value;
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter("name");
        
        StringWrapper w1 = new StringWrapper(s1);
        StringWrapper w2 = new StringWrapper("abc");
            
        PrintWriter writer = resp.getWriter();
        

        writer.println(w2.toString());    /* OK */
    }
    
    public String getDescription() {
        return "secure version of Factories3";
    }

    public int getVulnerabilityCount() {
        return 0;
    }
}