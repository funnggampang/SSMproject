/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-10 01:40:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>商品列表</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"dg\" title=\"商品列表\" class=\"easyui-datagrid\"\r\n");
      out.write("       url=\"/product/list\" data-options=\"pageSize:5,pageList:[5,10,15,20]\" toolbar=\"#toolbar\" pagination=\"true\"\r\n");
      out.write("       rownumbers=\"true\" fitColumns=\"true\" singleSelect=\"true\" >\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th data-options=\"field:'id'\" width=\"20\">id</th>\r\n");
      out.write("            <th data-options=\"field:'name'\" width=\"50\" >商品名称</th>\r\n");
      out.write("            <th data-options=\"field:'image',formatter:showImage\" width=\"50\">商品主图</th>\r\n");
      out.write("            <th data-options=\"field:'price'\" width=\"20\">价格</th>\r\n");
      out.write("            <th data-options=\"field:'marketPrice'\" width=\"20\">市场价格</th>\r\n");
      out.write("            <th data-options=\"field:'productBelongs'\" width=\"20\">作者</th>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"toolbar\">\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"editorProduct()\">编辑</a>\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"deleteProduct()\">删除</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" style=\"width:500px\" data-options=\"closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'\">\r\n");
      out.write("    <form id=\"fm\" method=\"post\" novalidate style=\"margin:0;padding:20px 50px\">\r\n");
      out.write("        <h3>商品信息</h3>\r\n");
      out.write("        <input type=\"hidden\" name=\"id\">\r\n");
      out.write("        <input type=\"hidden\" name=\"categoryId\" />\r\n");
      out.write("        <input type=\"hidden\" name=\"image\" />\r\n");
      out.write("        <input type=\"hidden\" name=\"description\" />\r\n");
      out.write("        <input type=\"hidden\" name=\"status\" />\r\n");
      out.write("        <div style=\"margin-bottom:10px\">\r\n");
      out.write("            <input name=\"name\" class=\"easyui-textbox\" required=\"true\"  label=\"商品名称：\" style=\"width:100%\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:10px\">\r\n");
      out.write("            <input name=\"price\" class=\"easyui-textbox\" required=\"true\"  label=\"商品价格：\"style=\"width:100%\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:10px\">\r\n");
      out.write("            <input name=\"marketPrice\" class=\"easyui-textbox\" required=\"true\"  label=\"市场价格：\" style=\"width:100%\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-bottom:10px\">\r\n");
      out.write("            <input name=\"productBelongs\" class=\"easyui-textbox\" required=\"true\"  label=\"作者：\" style=\"width:100%\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"dlg-buttons\">\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton c6\" iconCls=\"icon-ok\" onclick=\"editorProductDone()\"  style=\"width:100px\">修改</a>\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" onclick=\"javascript:$('#dlg').dialog('close')\" style=\"width:100px\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function showImage(value,row,index) {\r\n");
      out.write("        if (row.image){\r\n");
      out.write("            return \"<img style='height:100px;width:auto' src=http://192.168.46.128:8888/\"+row.image+\">\"\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var url;\r\n");
      out.write("\r\n");
      out.write("    function editorProduct(){\r\n");
      out.write("        var row = $('#dg').datagrid('getSelected');\r\n");
      out.write("        if (row){\r\n");
      out.write("            $('#dlg').dialog('open').dialog('center').dialog('setTitle','商品信息编辑');\r\n");
      out.write("            $('#fm').form('load',row);\r\n");
      out.write("            url = '/product/list/'+row.id;\r\n");
      out.write("            $(\"#fm\").find(\"input[name='id']\").val(row.id)\r\n");
      out.write("            $(\"#fm\").find(\"input[name='categoryId']\").val(row.categoryId)\r\n");
      out.write("            $(\"#fm\").find(\"input[name='image']\").val(row.image)\r\n");
      out.write("            $(\"#fm\").find(\"input[name='description']\").val(row.description)\r\n");
      out.write("            $(\"#fm\").find(\"input[name='status']\").val(row.status)\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function editorProductDone(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $.post(\"/product_editor\",$('#fm').serialize(),function(data){\r\n");
      out.write("            if (data.status == 200){\r\n");
      out.write("                $.messager.alert(\"提示\",\"修改成功！\");\r\n");
      out.write("                location.reload();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function deleteProduct(){\r\n");
      out.write("        var row = $('#dg').datagrid('getSelected');\r\n");
      out.write("        if (row){\r\n");
      out.write("            $.messager.confirm('警告','确定要删除这条商品信息！？',function(r){\r\n");
      out.write("                if (r){\r\n");
      out.write("                    $.post('/product_remove',{id:row.id},function(data){\r\n");
      out.write("                        if (data.status == 200){\r\n");
      out.write("                            $('#dg').datagrid('reload');    // reload the user data\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $.messager.show({    // show error message\r\n");
      out.write("                                title: 'Error',\r\n");
      out.write("                                msg: data.errorMsg\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    },'json');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
