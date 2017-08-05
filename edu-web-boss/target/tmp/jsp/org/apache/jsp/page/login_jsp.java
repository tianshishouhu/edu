package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>用户统登录</title>\r\n");
      out.write("<link href=\"statics/dwz/themes/css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".info{font-size: 12px;color: red;margin-left: 80px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"login\">\r\n");
      out.write("\t\t<div id=\"login_header\">\r\n");
      out.write("\t\t\t<h1 class=\"login_logo\">\r\n");
      out.write("\t\t\t\t<!-- <a href=\"#\"><img src=\"statics/dwz/themes/default/images/login_logo.gif\" /></a> -->\r\n");
      out.write("\t\t\t\t<a style=\"font-size:25px\">管理后台</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<div class=\"login_headerContent\">\r\n");
      out.write("\t\t\t\t<div class=\"navList\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" target=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h2 class=\"login_title\" style=\"font-size:16px\">用户登录</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"login_content\">\r\n");
      out.write("\t\t\t<div class=\"loginForm\">\r\n");
      out.write("\t\t\t\t<form action=\"login_userLogin.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>用户名：</label>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"userNo\" value=\"admin\" type=\"text\" style=\"width:140px;height:20px;\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"info\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNoMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>密&nbsp;&nbsp;&nbsp;码：</label>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"userPwd\" type=\"password\" style=\"width:140px;height:20px;\" class=\"login_input\" value=\"123456\" />\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"info\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userPwdMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p><br/><span class=\"info\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\r\n");
      out.write("\t\t\t\t\t<div class=\"login_bar\" style=\"margin-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"sub\" type=\"submit\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login_banner\"><img src=\"statics/dwz/themes/default/images/login_banner.jpg\" /></div>\r\n");
      out.write("\t\t\t<div class=\"login_main\">\r\n");
      out.write("\t\t\t\t<ul class=\"helpList\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">测试帐号：admin</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">默认密码：123456</a></li>\r\n");
      out.write("\t\t\t\t</ul>  \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"login_footer\">\r\n");
      out.write("\t\t\tCopyright &copy; 2015 WuShuicheng\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
