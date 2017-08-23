# Lunttilappu
## 23.8.2017
### H1
@WebServlet

//Suomi formaatti
//1sec refresh timer
wout.println("<head><meta http-equiv=\"refresh\" content=\"1\"></head>");
Date nykyhetki = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy HH:mm");
wout.println(sdf.format(nykyhetki));

//(Shift + F2 näkee käytön)
//(Ctrl + Space tekee importin)

// Nykyhetken ilmoitusmuoto on EPOCH TIME, millisekunteina hetkestä 1.1.1970.

PrintWriter wout = restponse.getWriter(); //Luodaan kirjoituskone

###H2

.jsp tiedostoissa Work -kansio -> Java-tiedosto -> Class
-> Virheilmoitus voi viitata generoituun java-tiedostoon
.jsp tiedostoissa javakoodi sijoitetaan <%   %> väliin
muuttujan arvon voi tulostaa <%=muuttuja %> tai <% out.println(muuttuja); %>
