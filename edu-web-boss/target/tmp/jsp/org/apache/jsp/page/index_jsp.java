package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/page/inc/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_date_name_format_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_date_name_format_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_date_name_format_nobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>样例管理后台</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/dwz.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body scroll=\"no\">\r\n");
      out.write("\t<div id=\"layout\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t    <!-- navMenu begin -->\r\n");
      out.write("\t\t\t<div class=\"headerNav\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"");
      out.print(path );
      out.write("/images/logo.png\" height=\"50\" />\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li style=\"color:black;\">欢迎您（");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("）！&nbsp;上次登录：");
      if (_jspx_meth_s_date_0(_jspx_page_context))
        return;
      out.write(" </li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:\" style=\"color:black;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"pms_userViewOwnInfo.action\" target=\"dialog\" width=\"500\" height=\"400\" style=\"color:#fff;\">帐号信息</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"pms_userChangeOwnPwdUI.action\" target=\"dialog\" width=\"550\" height=\"300\" style=\"color:#fff;\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login_logoutConfirm.action\" title=\"退出登录确认\" target=\"dialog\" width=\"300\" height=\"200\" style=\"color:#fff;\">退出</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"themeList\" id=\"themeList\">\r\n");
      out.write("\t\t\t\t\t<li theme=\"default\"><div class=\"selected\">蓝色</div></li>\r\n");
      out.write("\t\t\t\t\t<li theme=\"green\"><div>绿色</div></li>\r\n");
      out.write("\t\t\t\t\t<li theme=\"purple\"><div>紫色</div></li>\r\n");
      out.write("\t\t\t\t\t<li theme=\"silver\"><div>银色</div></li>\r\n");
      out.write("\t\t\t\t\t<li theme=\"azure\"><div>天蓝</div></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- navMenu end -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"leftside\">\r\n");
      out.write("\t\t\t<div id=\"sidebar_s\">\r\n");
      out.write("\t\t\t\t<div class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t<div class=\"toggleCollapse\"><div></div></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"toggleCollapse\"><h2>主菜单</h2><div>收缩</div></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"accordion\" fillSpace=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionHeader\">\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Folder</span>用户管理</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"tree treeFolder\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"pms_listPmsUser.action\" target=\"navTab\" rel=\"listPmsUser\" fresh=\"true\">用户信息管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div id=\"navTab\" class=\"tabsPage\">\r\n");
      out.write("\t\t\t\t<div class=\"tabsPageHeader\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsPageHeaderContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navTab-tab\">\r\n");
      out.write("\t\t\t\t\t\t\t<li tabid=\"main\" class=\"main\"><a href=\"javascript:;\"><span><span class=\"home_icon\">主页</span></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsLeft\">left</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsRight\">right</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsMore\">more</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"tabsMoreList\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">主页</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"navTab-panel tabsPageContent layoutBox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"page unitBox\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"accountInfo\">\r\n");
      out.write("\t\t\t\t\t\t\t<p><span>XX管理后台</span></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pageFormContent\" layoutH=\"60\" style=\"margin-right:230px\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">Copyright &copy; 2017 wangjian</div>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_date_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_0 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_0.setPageContext(_jspx_page_context);
    _jspx_th_s_date_0.setParent(null);
    _jspx_th_s_date_0.setName("lastLoginTime");
    _jspx_th_s_date_0.setFormat("yyyy年MM月dd日  HH时mm分ss秒");
    int _jspx_eval_s_date_0 = _jspx_th_s_date_0.doStartTag();
    if (_jspx_th_s_date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_0);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_0);
    return false;
  }
}
