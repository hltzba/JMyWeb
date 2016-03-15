<%
  String hello=request.getAttribute("Hello").toString();
  response.getWriter().write(hello);
%>  
${username}