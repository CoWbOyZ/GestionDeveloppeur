<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Bienvenue sur le site developpez.com</h2>
<h1>Infos Développeur</h1>
	Identifiant :
	<s:property value="developpeur.identifiant" />
	<br /> Pseudo :
	<s:property value="developpeur.pseudo" />
	<br /> Mail :
	<s:property value="developpeur.mail" />
	<br /> Code postale :
	<s:property value="developpeur.codePostal" />
	<br /> Date d'inscription :
	<s:property value="dateInscription" />
	<br /><a href="saisir_Developpeur.action">Ajouter un développeur</a>
	<br /><a href="lister_Developpeur.action">Lister les développeur</a>
	<s:debug/>
	</center>
	
</body>
</html>