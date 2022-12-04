package app.model.entities.tienda.medioDePago;


public class Efectivo extends MedioDePago {
    private static Efectivo instancia = null;
    private Efectivo() {};
    public static Efectivo getInstancia() {
        if(instancia == null) {
            instancia = new Efectivo();
        }
        return instancia;
    }
}
