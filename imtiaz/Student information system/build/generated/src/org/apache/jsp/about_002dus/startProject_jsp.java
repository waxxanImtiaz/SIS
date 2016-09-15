package org.apache.jsp.about_002dus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startProject_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>SIS</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/style2.css\">\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    window.history.forward();\r\n");
      out.write("    function noBack() { window.history.forward(); }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("    <img src=\"../img/duet_logo.png\" height=\"80\" width=\"110\">\r\n");
      out.write("\t\t<h2>STUDENT INFORMATION SYSTEM DUET</h2>\r\n");
      out.write("\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ -->\r\n");
      out.write("                <form  class=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Checker\" method=\"post\" >\r\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"username\" name=\"username\" />\r\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"password\" name=\"password\" />\r\n");
      out.write("\t\t\t<button type=\"submit\">Login</button>\r\n");
      out.write("            <button type=\"submit\">Forget Password</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<ul class=\"bg-bubbles\">\r\n");
      out.write("\t\t<li> <img src=\"../img/duet_logo.png\" height=\"60\" width=\"60\" > </li>\r\n");
      out.write("\t\t<li> <img src=\"../img/download (1).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download (3).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download (7).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"/img/download (6).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download (5).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download.jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download.png\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/download12.jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/fees.jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("        <li><img src=\"../img/images (2).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (3).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (3).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (4).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (5).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (6).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (7).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (8).jpg\"  height=\"60\" width=\"60\" ></li>\r\n");
      out.write("\t\t<li><img src=\"../img/images (10).jpg\" height=\"60\" width=\"60\"></li>\r\n");
      out.write("        \r\n");
      out.write("\t</ul>\r\n");
      out.write("     </div>\r\n");
      out.write("   \r\n");
      out.write(" ");

     request.getSession().invalidate();
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/index.js\"s></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
