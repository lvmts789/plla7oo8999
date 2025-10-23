// app/controllers/LibraryPage.java
package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class LOJLlplqq extends Controller {

    public Result lib(Http.Request req) {
        String q = req.getQueryString("q");

        String html =
            "<!doctype html>" +
            "<html lang='de'>" +
            "<head>" +
            "<meta charset='utf-8'/>" +
            "<meta name='viewport' content='width=device-width, initial-scale=1'/>" +
            "<title>Große GET-Seite</title>" +
            "<style>" +
            "body{font-family:Arial,Helvetica,sans-serif;margin:0;background:#fafafa;color:#222;}" +
            "header{background:linear-gradient(90deg,#36d1dc,#5b86e5);color:#fff;padding:32px 24px;}" +
            ".wrap{max-width:1100px;margin:0 auto;padding:24px;}" +
            "h1{margin:0 0 10px;font-size:32px;}" +
            "p{line-height:1.6;margin:10px 0;}" +
            ".card{background:#fff;border:1px solid #eaeaea;border-radius:10px;padding:16px;margin:12px 0;}" +
            ".grid{display:grid;grid-template-columns:repeat(3,1fr);gap:12px;}" +
            ".box{background:#fff;border:1px solid #eee;border-radius:12px;padding:16px;}" +
            "input[type=text]{padding:8px;border:1px solid #ccc;border-radius:6px;width:250px;}" +
            "button{padding:8px 12px;border:0;border-radius:6px;background:#5b86e5;color:#fff;margin-left:4px;cursor:pointer;}" +
            "button:hover{filter:brightness(1.1)}" +
            "table{border-collapse:collapse;width:100%;margin-top:10px;}" +
            "th,td{border:1px solid #ddd;padding:8px;text-align:left;}" +
            ".footer{color:#888;font-size:13px;text-align:center;padding:40px 10px;}" +
            "</style>" +
            "</head>" +
            "<body>" +
            "<header><div class='wrap'>" +
            "<h1>Große GET-Demo-Seite</h1>" +
            "<p>Aktueller Eingabewert: " + q + "</p>" +
            "<form method='get' action='/lib-one'>" +
            "<input type='text' name='q' placeholder='Gib etwas ein...'/>" +
            "<button type='submit'>Senden</button>" +
            "</form>" +
            "</div></header>" +

            "<main><div class='wrap'>" +
            "<div class='card'><h2>Über diese Seite</h2>" +
            "<p>Dies ist eine sehr große statische Seite, erzeugt durch eine einzige Methode.</p>" +
            "<p>Sie nutzt einfache String-Konkatenation mit + Zeichen — kein StringBuilder!</p>" +
            "</div>" +

            "<div class='card'><h2>Abschnitte</h2><div class='grid'>" +
            "<div class='box'><h3>Abschnitt 1</h3><p>Ein wenig Text hier.</p></div>" +
            "<div class='box'><h3>Abschnitt 2</h3><p>Etwas mehr Text da.</p></div>" +
            "<div class='box'><h3>Abschnitt 3</h3><p>Und hier noch etwas Text.</p></div>" +
            "</div></div>" +

            "<div class='card'><h2>Lange Liste</h2><ul>" +
            "<li>Eintrag 1</li>" +
            "<li>Eintrag 2</li>" +
            "<li>Eintrag 3</li>" +
            "<li>Eintrag 4</li>" +
            "<li>Eintrag 5</li>" +
            "<li>Eintrag 6</li>" +
            "<li>Eintrag 7</li>" +
            "<li>Eintrag 8</li>" +
            "<li>Eintrag 9</li>" +
            "<li>Eintrag 10</li>" +
            "</ul></div>" +

            "<div class='card'><h2>Tabelle</h2>" +
            "<table>" +
            "<thead><tr><th>ID</th><th>Name</th><th>Status</th></tr></thead><tbody>" +
            "<tr><td>1</td><td>Eintrag A</td><td>Aktiv</td></tr>" +
            "<tr><td>2</td><td>Eintrag B</td><td>Inaktiv</td></tr>" +
            "<tr><td>3</td><td>Eintrag C</td><td>Aktiv</td></tr>" +
            "<tr><td>4</td><td>Eintrag D</td><td>Wartend</td></tr>" +
            "<tr><td>5</td><td>Eintrag E</td><td>Aktiv</td></tr>" +
            "</tbody></table></div>" +

            "<div class='card'><h2>Aktueller Wert</h2>" +
            "<div class='box'><b>q:</b> " + q + "</div>" +
            "</div>" +

            "<div class='card'><h2>Zusätzlicher Inhalt</h2>" +
            "<p>Mehrere Absätze nur, um die Seite zu verlängern...</p>" +
            "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed eros eu risus accumsan facilisis.</p>" +
            "<p>Proin tempus semper nulla, sed ultrices sem viverra ac. Integer commodo eros id lacinia mattis.</p>" +
            "<p>Sed dignissim odio ac neque pharetra, quis elementum turpis suscipit.</p>" +
            "<p>Phasellus cursus nunc at nunc ultrices, et volutpat magna fermentum.</p>" +
            "<p>Praesent tempus libero et elit iaculis, eget laoreet erat malesuada.</p>" +
            "<p>Donec rhoncus sapien sit amet felis finibus dictum.</p>" +
            "</div>" +

            "<div class='footer'>" +
            "Einfache Seite • Nur GET • Play Java<br/>" +
            "Parameter q = " + q +
            "<br/><a href='/lib-one'>Zurück (GET)</a>" +
            "</div>" +

            "</div></main></body></html>";

        return ok(html).as("text/html");
    }
}
