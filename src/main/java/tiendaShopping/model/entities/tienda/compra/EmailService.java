package tiendaShopping.model.entities.tienda.compra;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.List;
import java.util.Properties;

public class EmailService {

    private static final Properties prop = new Properties();
    private static final Session session;
    private static final String username = "compras.tiendashopping@gmail.com";
    private static final String password = "xmnnotrqoaasfkqq";

    static {
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
    }

    public static void enviarComprobante(Factura factura, List<ItemFactura> items) {
        String cuerpo =
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                "    <title>Bootstrap demo</title>\n" +
                "    <link\n" +
                "      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\n" +
                "      rel=\"stylesheet\"\n" +
                "      integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    />\n" +
                "   <style>:root {--bs-font-sans-serif: system-ui, -apple-system, \"Segoe UI\", Roboto,\"Helvetica Neue\", \"Noto Sans\", \"Liberation Sans\", Arial, sans-serif,\"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\",\"Noto Color Emoji\";--bs-body-font-family: var(--bs-font-sans-serif);--bs-body-font-size: 1rem;--bs-body-font-weight: 400;--bs-body-line-height: 1.5;--bs-body-color: #212529;--bs-body-bg: #fff;--bs-border-width: 1px;--bs-border-style: solid;--bs-border-color: #dee2e6;--bs-border-color-translucent: rgba(0, 0, 0, 0.175);--bs-border-radius: 0.375rem;--bs-border-radius-sm: 0.25rem;--bs-border-radius-lg: 0.5rem;--bs-border-radius-xl: 1rem;--bs-border-radius-2xl: 2rem;--bs-border-radius-pill: 50rem;}*,::after,::before {box-sizing: border-box;}body {margin: 0;font-family: var(--bs-body-font-family);font-size: var(--bs-body-font-size);font-weight: var(--bs-body-font-weight);line-height: var(--bs-body-line-height);color: var(--bs-body-color);text-align: var(--bs-body-text-align);background-color: var(--bs-body-bg);-webkit-text-size-adjust: 100%;-webkit-tap-highlight-color: transparent;}hr {margin: 1rem 0;color: inherit;border: 0;border-top: 1px solid;opacity: 0.25;}.h1,.h2,.h3,.h4,.h5,.h6,h1,h2,h3,h4,h5,h6 {margin-top: 0;margin-bottom: 0.5rem;font-weight: 500;line-height: 1.2;}.h1,h1 {font-size: calc(1.375rem + 1.5vw);}@media (min-width: 1200px) {.h1,h1 {font-size: 2.5rem;}}.h2,h2 {font-size: calc(1.325rem + 0.9vw);}@media (min-width: 1200px) {.h2,h2 {font-size: 2rem;}}.h3,h3 {font-size: calc(1.3rem + 0.6vw);}@media (min-width: 1200px) {.h3,h3 {font-size: 1.75rem;}}.h4,p {margin-top: 0;margin-bottom: 1rem;}img,svg {vertical-align: middle;}table {caption-side: bottom;border-collapse: collapse;}th {text-align: inherit;text-align: -webkit-match-parent;}tbody,td,tfoot,th,thead,tr {border-color: inherit;border-style: solid;border-width: 0;}.table {--bs-table-color: var(--bs-body-color);--bs-table-bg: transparent;--bs-table-border-color: var(--bs-border-color);--bs-table-accent-bg: transparent;--bs-table-striped-color: var(--bs-body-color);--bs-table-striped-bg: rgba(0, 0, 0, 0.05);--bs-table-active-color: var(--bs-body-color);--bs-table-active-bg: rgba(0, 0, 0, 0.1);--bs-table-hover-color: var(--bs-body-color);--bs-table-hover-bg: rgba(0, 0, 0, 0.075);width: 100%;margin-bottom: 1rem;color: var(--bs-table-color);vertical-align: top;border-color: var(--bs-table-border-color);}.table > :not(caption) > * > * {padding: 0.5rem 0.5rem;background-color: var(--bs-table-bg);border-bottom-width: 1px;box-shadow: inset 0 0 0 9999px var(--bs-table-accent-bg);}.table > thead {vertical-align: bottom;}.shadow-lg {box-shadow: 0 1rem 3rem rgba(0, 0, 0, 0.175) !important;}.py-4 {padding-top: 1.5rem !important;padding-bottom: 1.5rem !important;}.py-5 {padding-top: 3rem !important;padding-bottom: 3rem !important;}.contenido-mayor {background-color: #fec11d;text-align: center;}.contenido {height: auto;width: 650px;width: auto;background-color: white;padding: 30px;display: inline-block;}.contenido-2 {margin: 0 auto;}</style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <main>\n" +
                "      <div class=\"album py-5 contenido-mayor\">\n" +
                "        <div class=\"container contenido shadow-lg\">\n" +
                "          <div class=\"contenido-2\" style=\"width: 650px;\">\n" +
                "            <h2>¡Gracias por comprar en " + factura.getTienda().getNombre() + "!</h2>\n" +
                "            <br>\n" +
                "            <p>\n" +
                "              "+ factura.getNombre() + " " + factura.getApellido() + " ¡Recibimos tu pedido y lo estamos preparando!\n" +
                "            </p>\n" +
                "            <p>\n" +
                "              Tu número de orden es #" + factura.getCodigo() + "\n" +
                "            </p>\n" +
                "            <br>\n" +
                "            <table class=\"table\" style=\"vertical-align: middle;\">\n" +
                "              <thead>\n" +
                "                <tr>\n" +
                "                  <th scope=\"col\" style=\"text-align: left; width: 150px;\">Producto</th>\n" +
                "                  <th scope=\"col\" style=\"width: 50px\">Cantidad</th>\n" +
                "                  <th scope=\"col\" style=\"width: 50px\">Precio unitario</th>\n" +
                "                  <th scope=\"col\" style=\"width: 50px\">Precio total</th>\n" +
                "                  <th scope=\"col\" style=\"width: 50px\">Tiempo de fabricación</th>\n" +
                "                </tr>\n" +
                "              </thead>\n" +
                "              <tbody>\n";
                for(ItemFactura item : items) {
                    cuerpo +=
                            "                <tr>\n" +
                            "                  <th scope=\"row\" style=\"text-align: left;\">" + item.getNombre() + "</th>\n" +
                            "                  <td>" + item.getCantidad() + "</td>\n" +
                            "                  <td>$" + item.getPrecio() + "</td>\n" +
                            "                  <td>$" + item.getPrecio() * item.getCantidad() + "</td>\n" +
                            "                  <td>" + item.getTiempoDeFabricacion() + "</td>\n" +
                            "                </tr>\n";
                }
                cuerpo +=
                "              </tbody>\n" +
                "            </table>\n" +
                "            <br>\n" +
                "            <p><b>Total: $" + factura.getTotal() +"</b></p> <br> <p>Medio de pago: " + factura.getMedioDePago() + "</p>"+
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </main>\n" +
                "    <script\n" +
                "      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\n" +
                "      integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    ></script>\n" +
                "  </body>\n" +
                "</html>";

                enviarEmail(factura.getEmail(), factura.getCodigo(), cuerpo);
    }

    public static void enviarEmail(String to, Integer facturaCodigo ,String texto) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            message.setSubject("¡Tu orden #" + facturaCodigo + " ha sido procesada!");

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(texto, "text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}