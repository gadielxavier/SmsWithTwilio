<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Automated call form</title>
</head>
<body>
 <p>Preencha as informações e pressione Enviar SMS</b>.</p>
 <br/>
  <form action="TwilioSms" method="post">
   <table>
     <tr>
       <td>Telefone Destino:</td>
       <td><input type="text" size=50 name="callTo" value="+5575992185862" />
       </td>
     </tr>
     <tr>
       <td>Telefone Origem:</td>
       <td><input type="text" size=50 name="callFrom" value="+18057166551" />
       </td>
     </tr>
     <tr>
       <td>Enviar SMS:</td>
       <td><input type="text" size=400 name="callText" value="" />
       </td>
     </tr>
     <tr>
       <td colspan=2><input type="submit" value="Enviar SMS" />
       </td>
     </tr>
   </table>
 </form>
 <br/>
</body>
</html>