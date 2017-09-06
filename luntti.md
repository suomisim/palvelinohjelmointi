# Lunttilappu
## 23.8.2017
### H1
@WebServlet

//Suomi formaatti
//1sec refresh timer

PrintWriter wout = restponse.getWriter(); //Luodaan kirjoituskone
wout.println("<head><meta http-equiv=\"refresh\" content=\"1\"></head>");
Date nykyhetki = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy HH:mm");
wout.println(sdf.format(nykyhetki));

//(Shift + F2 näkee käytön)
//(Ctrl + Space tekee importin)

// Nykyhetken ilmoitusmuoto on EPOCH TIME, millisekunteina hetkestä 1.1.1970.

### H2

.jsp tiedostoissa work -kansio -> Java-tiedosto -> Class
esim. C:\Users\a1501104\workspace\apache-tomcat-7.0.81\work
-> Virheilmoitus voi viitata generoituun java-tiedostoon
.jsp tiedostoissa javakoodi sijoitetaan <%   %> väliin
muuttujan arvon voi tulostaa <%=muuttuja %> tai <% out.println(muuttuja); %>

Materialize ulkonäköpaketti, css-tiedostot styles-kansioon

### H3

get -> tiedot urliin
post -> tiedot payloadiin
Chromeen postman -addon

### Tietoturva & H4

siege työkalu kuormitusta varten
fail2ban perussuojaus linuxille
Varoitus viikkotentistä harjoituksessa 4
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> avulla suojaudutaan XSS hyökkäystä vastaan, esim:
<c:out value="${henkilo.etunimi}"/>

### H5

Sessio tallentaa cookien, sisältää JSESSIONID


## 30.8.2017

Github jusju ownserver
Source -> Generate getters and setters...
New -> New Servlet
3 kirjainta + ctrl + space
Tietokannan kanssa kommunikoidaan SSH-yhteydellä
MySQL workbench graafinen käyttöliittymä

### H6

DAO = Data Access Object avulla olion tiedot voidaan tallentaa tietokantaan
CRUD = Create Read Update Delete
Asetustiedostot luodaan New -> Source Folder
WEB-INF alla olevien näkyvyyttä voi säätää

Harjoitukseen helpoin tapa toteuttaa poisto on:
Jokainen rivi oma forminsa jolla oma ID
Suola täytyy olla selkokielisenä, käytetään vertaamaan hasheja 

## 6.9.2017

System.out.println("DEBUG: " +action);

### MAVEN

"Build" -työkalu, hakee tarvittavat jarrit internetistä
POM.xml tiedosto kertoo mitä jarreja tarvitaan (DEPENDENCY kohta)
https://mvnrepository.com/
Kotihakemistoon viitataan ~ merkillä ~/m2/repository
Mavenin avulla voi esim. deployata ohjelmiston palvelimelle
Gradle on "uudempi versio" Mavenista, joka ei käytä XML:ää
Käytetään komentoriviltä
mvn install asettaa paikalliseen repoon projektin, jolloin muut projektit voivat käyttää sen riippuvuuksia

### JUNIT

Testaustyökalu, yksikkötestejä, käytettävyystestaus, suorituskykytestaus, tietoturvatestaus

### Demo 11

Convention over Configuration = Mavenin oletushakemistorakenne
GitHubin kanssa on huomioitava tyhjät hakemistot -> eivät siirry GitHubiin -> Jokaiseen hakemistoon tiedosto (esim. .gitkeep)
Testit /src/test/java
Testimetodit alkavat aina test ja annotoidaan aina @Test
import org.junit.Test; import static org.junit.Assert.*; mukaan
.jsp tiedostot src/main/webapp/ kansioon / webapp/WEB-INF/jsp/ kansioon


### Maven projekti GitHubiin

New -> Other -> Maven -> Maven Project
Simple project
Paketoinniksi war
webapp -> WEB-INF/web.xml vaaditaan (ehkä)
Jokaiseen tyhjään hakemistoon .gitkeep tiestosto






