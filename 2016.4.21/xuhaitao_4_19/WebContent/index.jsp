<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
<script type="text/javascript">
       function checkform(){
    	   if(form.username.value==""){    
    	        alert('用户名输入为空！');
    	        form.username.focus();
    	        return false;
    	    }
    	   if(form.email.value==""){    
   	        alert('邮箱输入错误！');
   	        form.email.focus();
   	        return false;
   	               
   	  		}else if(form.password.value==""){
   	  		alert('密码输入为空！');
   	        form.password.focus();
   	        return false;
   	  		}   
   	    }
       
     
	
</script>
</head>
<body>
<form  id="form" action="/xuhaitao_4_19/Resgister"  method="post" onsubmit="checkform()">
 <table>
<tr>
<td>姓名: <input  type="text" name="username" id="username"></td>
</tr>
<tr>
<td>邮箱: <input  type="text" name="email" id="email" ></td>
</tr>
<tr>
<td>密码: <input type="password" name="password" id="password" maxlength="6"></td>
</tr>
<tr>
<td><input type="submit" value="注册"  > 
<input type="reset" value="重置" style="background-color:red">
</td> 
</tr>
</table></form> 
</body>
 
</html>