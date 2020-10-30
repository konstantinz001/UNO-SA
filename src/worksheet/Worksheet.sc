//Varianten in Array

val zahl = Array("0","1","2","3","4","5","6","7","8","9")
val aktion = Array("Zieh-Zwei","Retour","Aussetzen")
val joker = Array("Farbwahl", "Zieh-Vier__Farbwahl")

val farbe = Array("rot","gruenn","blau","gelb")

//Zählvariablen für Schleifen
val a = 0
val b = 0
val c = 0

//Farbkarten mit Zahlen konfigurieren ...(zahl x farbe) * 2 = 80 Karten
//actionKarte(Zahl)(Farbe)  | Zahl ab (10) Wdh. also 0,1...
val zahlKarte2 = Array.ofDim[String](2* zahl.length, farbe.length)
for (c <- 0 to 1) {
  for (a <- zahl.indices) {
    for (b <- farbe.indices) {
      zahlKarte2(a+(c*zahl.length))(b) = zahl(a) + " || " + farbe(b)
      println(zahlKarte2(a)(b))
    }
  }
}

//Farbkarten mit Aktion konfigurieren ...(aktion x farbe) * 2 = 24
//actionKarte(Aktion)(Farbe)  | Aktion ab (4) Wdh. also +2, retour...
val aktionKarte = Array.ofDim[String]((2*aktion.length), farbe.length)

for (c <- 0 to 1) {
  for (a <- aktion.indices) {
    for (b <- farbe.indices) {
      aktionKarte(a+(c*3))(b) = aktion(a) + " || " + farbe(b)
      println(aktionKarte(a)(b))
    }
  }
}

//Jokerkarten konfigurieren ...(joker * 2) * 2 = 4
//jokerKarte(Wdh.)(Variante)
val jokerKarte = Array.ofDim[String](2,joker.length)

for (c <- 0 to 1) {

  for (a <- joker.indices) {
    jokerKarte(c)(a) = joker(a) + " || schwarz"
    println(jokerKarte(c)(a))
  }
}
