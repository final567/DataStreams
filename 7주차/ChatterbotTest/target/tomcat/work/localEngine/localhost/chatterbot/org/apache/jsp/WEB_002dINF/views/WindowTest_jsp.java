package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WindowTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<HTML>\r\n");
      out.write("\t<HEAD>\r\n");
      out.write("\t\t<script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\r\n");
      out.write("\t\t<script src=\"dialog.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"mystyle.css\" />\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t//power_button 누르면 윈도우 창 생성\r\n");
      out.write("\t\t\t\t$( \"#power_button\" ).click(function() {\r\n");
      out.write("\t\t\t\t\t$( \"#windows\" ).dialog();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//start_button 누를때마다 새로운 explorer 생성\r\n");
      out.write("\t\t\t\t$(\"#start_button\").click(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#windows\").dialog().appendDiv(\"explorer\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t</HEAD>\r\n");
      out.write("\t<BODY>\r\n");
      out.write("\t\t<input type=\"button\" id=\"power_button\" value=\"Power\"></input>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"windows\">\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"start_button\"></input>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
