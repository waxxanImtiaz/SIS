package org.apache.jsp.WEB_002dINF.about_002dus;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>SIS</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style2.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("    <img src=\"img/duet_logo.png\" height=\"80\" width=\"110\">\n");
      out.write("\t\t<h2>STUDENT INFORMATION SYSTEM DUET</h2>\n");
      out.write("\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ -->\n");
      out.write("                <form  class=\"form\" action=\"index.jsp\"  >\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"username\" name=\"username\" />\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"password\" name=\"password\" />\n");
      out.write("\t\t\t<button type=\"submit\">Login</button>\n");
      out.write("            <button type=\"submit\">Forget Password</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<ul class=\"bg-bubbles\">\n");
      out.write("\t\t<li> <img src=\"img/duet_logo.png\" height=\"60\" width=\"60\" > </li>\n");
      out.write("\t\t<li> <img src=\"img/download (1).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download (3).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download (7).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download (6).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download (5).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download.jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download.png\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/download12.jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/fees.jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("        <li><img src=\"img/images (2).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (3).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (3).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (4).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (5).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (6).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (7).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (8).jpg\"  height=\"60\" width=\"60\" ></li>\n");
      out.write("\t\t<li><img src=\"img/images (10).jpg\" height=\"60\" width=\"60\"></li>\n");
      out.write("        \n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
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
