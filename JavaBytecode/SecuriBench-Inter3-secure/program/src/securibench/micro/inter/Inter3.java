/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Inter3.java,v 1.6 2006/04/21 17:14:26 livshits Exp $
 */
package securibench.micro.inter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="secure version of Inter3" 
 *  @servlet vuln_count="0" 
 *  */
public class Inter3 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";
    private PrintWriter writer;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter(FIELD_NAME);
        
        writer = resp.getWriter();
        f1(name);
    }
    
    private void f1(String name) {
        f2(name);        
    }

    private void f2(String name) {
        f3(name);
        f3("ade".concat(name)); 
    }

    private void f3(String name) {
        f4(name);
    }

    private void f4(String name) {
        f5(name);        
    }

    private void f5(String name) {
        f6(name);
    }

    private void f6(String name) {
        f7(name);
        f7(name + "abc");
        f8("adsf "+ name + "abc");
        f8("adsf "+ name + "abc");
        
    }

    private void f7(String name) {
        f8(name);        
    }

    private void f8(String name) {
        f9(name);        
    }

    // reachable code
    private void f9(String name) {

    }
    
    // dead code
    public void f0(String name) {
        writer.println(name);       /* OK */        
    }

    public String id(String string, PrintWriter writer) {
        writer.println(string);     /* OK */
        
        return string;
    }

    public String getDescription() {
        return "secure version of Inter3";
    }
    
    public int getVulnerabilityCount() {
        return 0;
    }
}