<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 11</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
	<img src="images/hh_logo.jpg" alt="HAAGA-HELIA" />
	<h1>Java EE</h1>
	<h2>DEMO 11</h2>
	<div id="contentbox">
		<h3>Sis�lt�</h3>
		<ul>
			<li>Maven</li>
			<li>JUnit</li>
		</ul>
		<h3>Toiminta</h3>
		<p>Demo sis�lt�� kaksi sovellusta, laskimen ja kellon.
			Laskin-luokan metodeita on testattu JUnit-yksikk�testeill�.
			SuomiKello-luokan metodeita on my�s testattu yksikk�testeill� ja
			ulkoinen KelloLahde on rajattu testist� pois k�ytt�en Mock-oliota.</p>
		<p>Viikkotentin harjoitusta varten Kello-sovellukseen on lis�tty GmtIsoKello -luokka, joka n�ytt�� GMT-ajan ISO-standardin mukaan.
		GmtIsoKello-luokan metodeita on my�s testattu yksikk�testill� ja testi on lis�tty AllTests-suiteen
		</p>
		<h4>Kello-sovelluksen luokkakaavio</h4>
		<p>
			<img src="images/kello_luokkakaavio.png" />
		</p>
		<h3>Linkit</h3>
		<ul>
			<li><a href="laskin">laskin</a></li>
			<li><a href="kello">kello</a></li>
		</ul>
	</div>
</body>
</html>