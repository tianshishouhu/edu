package org.apache.jsp.page.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dwz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"statics/dwz/themes/default/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"statics/dwz/themes/css/core.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"statics/dwz/themes/css/print.css\" rel=\"stylesheet\" type=\"text/css\" media=\"print\"/>\r\n");
      out.write("<link href=\"statics/dwz/uploadify/css/uploadify.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<link href=\"statics/dwz/themes/css/ieHack.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lte IE 9]>\r\n");
      out.write("<script src=\"statics/dwz/js/speedup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"statics/dwz/js/jquery-1.7.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/jquery.cookie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/jquery.validate.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/jquery.bgiframe.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/xheditor/xheditor-1.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/xheditor/xheditor_lang/zh-cn.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/uploadify/scripts/jquery.uploadify.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/raphael.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/g.raphael.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/g.bar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/g.line.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/g.pie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"statics/dwz/chart/g.dot.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.util.date.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.validate.method.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.regional.zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.barDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.drag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.tree.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.accordion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.theme.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.switchEnv.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.alertMsg.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.contextmenu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.navTab.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.tab.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.resize.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.dialog.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.dialogDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.sortDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.cssTable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.stable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.taskBar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.ajax.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.pagination.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.database.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.datepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.effects.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.panel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.checkbox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.history.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.combox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.print.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--\r\n");
      out.write("<script src=\"statics/dwz/bin/dwz.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("-->\r\n");
      out.write("<script src=\"statics/dwz/js/dwz.regional.zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tDWZ.init(\"statics/dwz/dwz.frag.xml\", {\r\n");
      out.write("\t\tloginUrl:\"login_loginPage.action\", loginTitle:\"登录\",\t// 弹出登录对话框\r\n");
      out.write("//\t\tloginUrl:\"login.html\",\t// 跳到登录页面\r\n");
      out.write("\t\tstatusCode:{ok:200, error:300, timeout:301}, //【可选】\r\n");
      out.write("\t\tpageInfo:{pageNum:\"pageNum\", numPerPage:\"numPerPage\", orderField:\"orderField\", orderDirection:\"orderDirection\"}, //【可选】\r\n");
      out.write("\t\tdebug:false,\t// 调试模式 【true|false】\r\n");
      out.write("\t\tcallback:function(){\r\n");
      out.write("\t\t\tinitEnv();\r\n");
      out.write("\t\t\t$(\"#themeList\").theme({themeBase:\"statics/dwz/themes\"}); // themeBase 相对于index页面的主题base路径\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>");
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
