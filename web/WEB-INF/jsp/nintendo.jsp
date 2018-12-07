<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String name = request.getParameter("name"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ol class="breadcrumb">
    <li><a href="#">任天堂</a></li>
    <li><a href="#">产品</a></li>
    <li class="active">NS</li>
</ol>
<div>
    <table>
        <tr> <td>name</td> <td id="id1">unknown</td> </tr>
        <tr> <td>price</td> <td id="id2">unknown</td> </tr>
        <tr> <td>company</td> <td id="id3">unknown</td> </tr>
    </table>
</div>
<%--<%
    out.println("Hello World！" +name);
%>--%>
<div class="form-group">
    <label class="col-sm-3 control-label" >game list</label>
    <div class="col-sm-3">
        <select name="dealer_id" id="dealer_id" class="selectpicker show-tick form-control"  data-width="98%" data-first-option="false" title='请选择经销商(必选)' required data-live-search="true">
            <option value="1">zelda</option>
            <option value="2">mario</option>
            <option value="3">pokemon</option>
        </select>
    </div>
</div>
</body>
</html>

<link rel="stylesheet" href="../../resources/bootstrap-3.3.7/css/bootstrap.css" type="text/css"/>
<script type="text/javascript" src="../../resources/js/jquery/jquery-3.3.1.js"></script>
<script type="text/javascript" src="../../resources/bootstrap-3.3.7/js/bootstrap.js"/>
<script type="text/javascript">
    <% String price = request.getParameter("price"); %>
    $(function() {
        var p = price;
        alert(p);
    });
    //init method
//    jQuery(function($){
//        var price = "<=%price%>";
//        $("#id2").html("222");
//    });

    $(document).ready(function(){
        alert(1);
        $("button").click(function(){
            $(this).hide();
        });
    });

    window.onload = function(){
        alert(1);
    }


</script>

<%--<script language="javascript" for="window" event="onload">--%>
    <%--function abc() {--%>
        <%--var price = "<=%price%>";--%>
        <%--$("#id2").html(price);--%>
    <%--}--%>
    <%--</script>--%>