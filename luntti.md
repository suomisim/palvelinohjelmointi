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
