package app.model.entities.tienda.medioDePago;

public class Tarjeta extends MedioDePago{
    private static Tarjeta instancia = null;
    private Tarjeta() {};
    public static Tarjeta getInstancia() {
        if(instancia == null) {
            instancia = new Tarjeta();
        }
        return instancia;
    }
}
