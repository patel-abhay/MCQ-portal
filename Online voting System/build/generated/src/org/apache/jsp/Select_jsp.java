package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Select_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Select Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body> \n");
      out.write("        <div style=\"width:12%;background: #00FFFF\"><b>select your Test ....!</b></div>\n");
      out.write("        <div style=\"width:50%;background:#ffffff;float:left\">\n");
      out.write("            \n");
      out.write("            <br/><br/><br/><br/><br><b>Engineering</b><br/>\n");
      out.write("          <br> 1> <a href=\"\">  Civil Engineering</a><br/>\n");
      out.write("            <br> 2> <a href=\"\">Electrical Engineering</a><br/>\n");
      out.write("            <br> 3> <a href=\"\">Mechanical Engineering</a><br/>\n");
      out.write("            <br> 4> <a href=\"\">Electronics Engineering</a><br/></div><br/><br/><br/><br/>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        <div style=\"width:50%;background: #ffffff;float:left\" >\n");
      out.write("         <br><b>   General Aptitude </b><br/>\n");
      out.write("         <br>1><a href=\"\"> Aptitude</a><br/>\n");
      out.write("            <br>2><a href=\"\">Reasoning</a><br/>\n");
      out.write("            <br>3><a href=\"\">General Science</a><br/>\n");
      out.write("            <br>4><a href=\"\">English</a><br/><br/><br/><br/><br/></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div style=\"width:50%;background: #ffffff;float:left\" >\n");
      out.write("                 <br><b>  Computer </b><br/>\n");
      out.write("           <br>1><a href=\"\">Computer Fundamental</a><br/>\n");
      out.write("            <br>2><a href=\"\">Networking</a><br/>\n");
      out.write("            <br>3><a href=\"\">Database Management</a><br/>\n");
      out.write("            <br>4><a href=\"\">c Program</a><br/><br/><br/><br/><br/></div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div style=\"width:50%;background: #ffffff;float:left\" >\n");
      out.write("               <br><b> GK </b><br/>\n");
      out.write("           <br>1><a href=\"\"> Static GK</a><br/>\n");
      out.write("            <br>2><a href=\"\">History</a><br/>\n");
      out.write("            <br>3><a href=\"\">Geography</a><br/>\n");
      out.write("            <br>4><a href=\"\">Polity</a><br/><br/><br/><br/><br/></div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
