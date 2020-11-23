<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/gptApi/getNext" method="get">
    <div align="center" style="padding: 10px;padding-top: 5%" >
        <input name="key" align="center" id="key" style="width:40%";/>
        <input  type="submit" id="submit" value="提交"></input>
    </div>
    <div align="center">
        <textarea name="result" rows="30" cols="100" disabled="disabled" >${result}</textarea>
    </div>
</form>
</body>

</html>