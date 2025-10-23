// app/controllers/LibraryPage.java
package controllers;

import play.mvc.Result;
import play.mvc.Http;
import play.mvc.Results.ok;

public class LOJLlplqq extends Controller {

    // SINGLE METHOD • GET ONLY • "VERY VERY BIG" HTML PAGE
    public Result lib(Http.Request req) {
        String q = req.getQueryString("q");

        StringBuilder html = new StringBuilder(120_000);

        html.append("<!doctype html>");
        html.append("<html lang='de'><head><meta charset='utf-8'/>");
        html.append("<meta name='viewport' content='width=device-width, initial-scale=1'/>");
        html.append("<title>Riesen-GET-Seite</title>");
        html.append("<style>");
        html.append("body{font-family:Arial,Helvetica,sans-serif;margin:0;background:#fafafa;color:#222;}");
        html.append("header{background:linear-gradient(90deg,#5b86e5,#36d1dc);color:#fff;padding:32px 24px;}");
        html.append(".wrap{max-width:1100px;margin:0 auto;padding:24px;}");
        html.append("h1{margin:0 0 10px;font-size:32px;}");
        html.append("h2{margin:28px 0 12px;font-size:24px;color:#333;}");
        html.append("h3{margin:18px 0 8px;font-size:18px;color:#444;}");
        html.append("p{line-height:1.6;margin:10px 0;}");
        html.append(".card{background:#fff;border:1px solid #eaeaea;border-radius:10px;padding:16px;margin:12px 0;box-shadow:0 1px 0 rgba(0,0,0,.03);}");
        html.append(".grid{display:grid;grid-template-columns:repeat(3,1fr);gap:12px;}");
        html.append(".box{background:#fff;border:1px solid #eee;border-radius:12px;padding:16px;}");
        html.append(".muted{color:#666;}");
        html.append("form{margin:16px 0;}");
        html.append("input[type=text]{padding:8px 10px;border:1px solid #ccc;border-radius:6px;width:260px;}");
        html.append("button{padding:8px 12px;border:0;border-radius:6px;background:#5b86e5;color:#fff;cursor:pointer;margin-left:6px;}");
        html.append("button:hover{filter:brightness(1.05)}");
        html.append("table{border-collapse:collapse;width:100%;background:#fff;border:1px solid #eee;border-radius:10px;overflow:hidden;}");
        html.append("th,td{border-bottom:1px solid #f0f0f0;padding:10px 12px;text-align:left;font-size:14px;}");
        html.append("thead th{background:#f7f9fc;font-weight:600;}");
        html.append(".pill{display:inline-block;padding:3px 8px;border-radius:999px;background:#eef3ff;color:#3155d0;font-size:12px;border:1px solid #dbe5ff;}");
        html.append(".tag{display:inline-block;padding:3px 8px;border-radius:8px;background:#f4f4f4;margin:2px;font-size:12px;}");
        html.append(".kbd{font-family:monospace;background:#111;color:#0f0;padding:2px 6px;border-radius:4px;font-size:12px;}");
        html.append(".footer{color:#888;font-size:13px;text-align:center;padding:40px 10px;}");
        html.append(".cols{display:grid;grid-template-columns:2fr 1fr;gap:16px;}");
        html.append(".notice{background:#fff7d6;border:1px solid #ffe9a7;border-radius:10px;padding:12px;}");
        html.append("</style></head><body>");

        // HEADER
        html.append("<header><div class='wrap'>");
        html.append("<h1>Riesige GET-Demo-Seite</h1>");
        html.append("<p class='muted'>Eine einzige Play-Action, nur GET, mit viel statischem Inhalt. Aktueller Eingabewert: ");
        html.append(q);
        html.append("</p>");
        html.append("<form method='get' action='/lib-one'>");
        html.append("<input type='text' name='q' placeholder='Schreibe etwas…'/>");
        html.append("<button type='submit'>Senden</button>");
        html.append("</form>");
        html.append("</div></header>");

        html.append("<main><div class='wrap'>");

        // INTRO SECTION
        html.append("<div class='cols'>");
        html.append("<section class='card'>");
        html.append("<h2>Über diese Seite</h2>");
        html.append("<p>Dies ist eine <strong>sehr große</strong> HTML-Seite, die komplett aus einer einzigen Play-Action generiert wird. ");
        html.append("Sie nimmt einen optionalen GET-Parameter <span class='kbd'>q</span> entgegen und zeigt ihn an.</p>");
        html.append("<p class='muted'>Beispiel: <span class='kbd'>/lib-one?q=Hallo</span></p>");
        html.append("</section>");

        html.append("<aside class='card notice'>");
        html.append("<h3>Hinweis</h3>");
        html.append("<p>Alle Inhalte hier sind nur Demo-Texte: Listen, Tabellen, Boxen, Raster, usw. ");
        html.append("Das Ziel ist einfach: <em>viel HTML</em> zeigen, in einem einzigen Handler.</p>");
        html.append("</aside>");
        html.append("</div>");

        // QUICK STATS
        html.append("<section class='card'>");
        html.append("<h2>Schnellübersicht</h2>");
        html.append("<div class='grid'>");
        for (int i = 1; i <= 9; i++) {
            html.append("<div class='box'><h3>Box ").append(i).append("</h3>");
            html.append("<p class='muted'>Kleiner Beschreibungstext für Box ").append(i).append(".</p>");
            html.append("<span class='pill'>Status: OK</span></div>");
        }
        html.append("</div></section>");

        // LONG LISTS
        html.append("<section class='card'>");
        html.append("<h2>Lange Liste</h2>");
        html.append("<p>Ein paar Einträge, rein informativ:</p>");
        html.append("<ul>");
        for (int i = 1; i <= 40; i++) {
            html.append("<li>Eintrag #").append(i).append(" – Beispieltext zu einem Punkt in einer langen Liste.</li>");
        }
        html.append("</ul>");
        html.append("</section>");

        // TAG CLOUD
        html.append("<section class='card'>");
        html.append("<h2>Tag-Wolke</h2>");
        for (int i = 1; i <= 60; i++) {
            html.append("<span class='tag'>Tag").append(i).append("</span>");
        }
        html.append("</section>");

        // BIG TABLE
        html.append("<section class='card'>");
        html.append("<h2>Große Tabelle</h2>");
        html.append("<p>Eine Tabelle mit vielen Zeilen. Spalten: ID, Titel, Kategorie, Bewertung, Hinweis.</p>");
        html.append("<table><thead><tr>");
        html.append("<th>ID</th><th>Titel</th><th>Kategorie</th><th>Bewertung</th><th>Hinweis</th>");
        html.append("</tr></thead><tbody>");
        for (int i = 1; i <= 120; i++) {
            html.append("<tr>");
            html.append("<td>").append(i).append("</td>");
            html.append("<td>Beispiel-Titel ").append(i).append("</td>");
            html.append("<td>").append(i % 2 == 0 ? "A" : "B").append("</td>");
            html.append("<td>").append((i % 5) + 1).append(" / 5</td>");
            html.append("<td>").append(i % 3 == 0 ? "Empfohlen" : "—").append("</td>");
            html.append("</tr>");
        }
        html.append("</tbody></table>");
        html.append("</section>");

        // ACCORDION-LIKE (STATIC)
        html.append("<section class='card'>");
        html.append("<h2>Fragen & Antworten</h2>");
        for (int i = 1; i <= 10; i++) {
            html.append("<div class='box'>");
            html.append("<h3>Frage ").append(i).append("</h3>");
            html.append("<p class='muted'>Antwort ").append(i).append(": Kurzer Beispieltext zur Erläuterung der Frage. ");
            html.append("Dies ist rein statischer Inhalt, nur zur Darstellung der Größe.</p>");
            html.append("</div>");
        }
        html.append("</section>");

        // MULTI-COLUMN CONTENT
        html.append("<section class='card'>");
        html.append("<h2>Mehrspaltiger Inhalt</h2>");
        html.append("<div class='grid'>");
        for (int c = 1; c <= 12; c++) {
            html.append("<div class='box'>");
            html.append("<h3>Abschnitt ").append(c).append("</h3>");
            html.append("<p>Ein kurzer Textabschnitt. Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");
            html.append("Integer mattis, velit in pulvinar fermentum, augue nunc consequat mi, sed tincidunt orci leo eget dolor.</p>");
            html.append("<p class='muted'>Mehr Details folgen ggf. später.</p>");
            html.append("</div>");
        }
        html.append("</div></section>");

        // CURRENT INPUT MIRROR
        html.append("<section class='card'>");
        html.append("<h2>Deine aktuelle Eingabe</h2>");
        html.append("<p>Parameter <span class='kbd'>q</span> spiegelt hier:</p>");
        html.append("<div class='box'><strong>q = </strong><span>");
        html.append(q);
        html.append("</span></div>");
        html.append("<p class='muted'>Erneut testen? Verwende das Formular oben oder die Adresszeile.</p>");
        html.append("</section>");

        // MANY PARAGRAPHS
        html.append("<section class='card'>");
        html.append("<h2>Viele Absätze</h2>");
        for (int i = 1; i <= 50; i++) {
            html.append("<p>Absatz ").append(i).append(": Dies ist ein Platzhaltertext für eine sehr große Seite. ");
            html.append("Manchmal muss man einfach viel HTML erzeugen, um Layouts, Performance oder Rendering zu testen.</p>");
        }
        html.append("</section>");

        // MINI CODE BLOCKS
        html.append("<section class='card'>");
        html.append("<h2>Mini-Codebeispiele</h2>");
        for (int i = 1; i <= 15; i++) {
            html.append("<div class='box'><pre style='margin:0'><code>");
            html.append("GET /lib-one?q=Test").append(i).append("\n");
            html.append("200 OK (text/html)\n");
            html.append("</code></pre></div>");
        }
        html.append("</section>");

        // FOOTER
        html.append("<div class='footer'>");
        html.append("Große GET-Demo • Eine Methode • Play Java • ");
        html.append("Parameter q = <span class='kbd'>").append(q).append("</span>");
        html.append("<br/>");
        html.append("<a href='/lib-one' style='color:#5b86e5;text-decoration:none'>Zurück zum Formular (GET)</a>");
        html.append("</div>");

        html.append("</div></main>");
        html.append("</body></html>");

        return ok(html.toString()).as("text/html");
    }
}
