<%@page import="servlet.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sucesso</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato:wght@300&family=Open+Sans&family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
.sucesso h1{
	color: #64e998;
}
body{
font-family: 'Open Sans', sans-serif;	
}
.home{
margin-left: 5px;
}
.home a{
color: #64e998;
font-size: 35px;
}
.home a:hover {
	color:#0A1A10;
}
</style>
</head>
<body>
<%	Pessoa pessoa = (Pessoa) request.getAttribute("pessoa");%>
<section class="sucesso">
	<h1> Cadastro realizado com sucesso </h1>
	<h1>${pessoa.genero} ${pessoa.nome} ${pessoa.sobrenome}</h1>
	<h1>${date}</h1>
	
	
</section>
<section class="icone">
<img alt="" src="image/verificar.png">
</section>
<section class="home">
<a href="landPage.html">Voltar ao início</a>
</section>
 

</body>
</html>