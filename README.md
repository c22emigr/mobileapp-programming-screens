
# Rapport

Det första steget var att lägga till en ny actitivty vilket jag gjorde genom att skapa en ny "empty activity". Detta gjorde jag 
eftersom att vi med en knapp ska kunna komma till den nya aktiviteten.
För att få knappen att fungera så ska den ha en intent vilket innebär att vi lägger till en funktion så att knappen tar oss till MainActivity2.
När vi kommer till vår nya aktivitet så skickas även en string och en int med som sedan displayas på den nya aktiviteten.
För att stringen och vår integer ska visas så 

        private Intent knopp;
        private Button button1;
        public void onClick(View v) {
        startActivity(new Intent (MainActivity.this, MainActivity2.class));
        knopp = new Intent(MainActivity.this, MainActivity2.class);
        knopp.putExtra("name", "Emil"); // Optional
        knopp.putExtra("number", 99); // Optional
        startActivity(knopp);
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Name = extras.getString("name");
            Number = extras.getInt("number");
            textview = findViewById(R.id.textView1);
            textview.setText(Name+Number);
        }




## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
