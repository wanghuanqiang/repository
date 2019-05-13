
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<body>
<h2>Hello World!</h2>
<h3>
<a href="food?todo=search">searchFood </a><br>
<a href="html/index.html">MLSindex.html</a><br>
<a href="index.jsp">MLSindex.jsp</a><br>
<a href="index.jsp">麦乐送</a>
<a href="caidabyinpin.jsp">菜单</a>
<a href="z">我的账户</a>
<a href="question.jsp">帮助</a>








</h3>
item Root:   <%=basePath%>



</body>
</html>
