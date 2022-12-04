package app.model.converter;

import app.model.entities.tienda.medioDePago.Tarjeta;
import app.model.entities.tienda.medioDePago.Efectivo;
import app.model.entities.tienda.medioDePago.MedioDePago;
import app.model.entities.tienda.medioDePago.Transferencia;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.HashMap;
import java.util.Map;

@Converter
public class MedioDePagoConverter implements AttributeConverter<MedioDePago, String> {
    Map<MedioDePago, String> map = new HashMap<MedioDePago, String>() {{
        put(Efectivo.getInstancia(), "Efectivo");
        put(Tarjeta.getInstancia(), "Tarjeta");
        put(Transferencia.getInstancia(), "Transferencia");
    }};
    @Override
    public String convertToDatabaseColumn(MedioDePago medioDePago) {
        return map.get(medioDePago);
    }

    @Override
    public MedioDePago convertToEntityAttribute(String s) {
        return map.entrySet().stream().filter(entry -> entry.getValue().equals(s)).findFirst().get().getKey();
    }
}
