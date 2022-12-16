package tiendaShopping.converters;

import tiendaShopping.model.entities.tienda.MedioDePago;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Map;

@Converter
public class MedioDePagoConverter implements AttributeConverter<MedioDePago, String> {

    @Override
    public String convertToDatabaseColumn(MedioDePago medioDePago) {
        return medioDePago.name();
    }
    @Override
    public MedioDePago convertToEntityAttribute(String s) {
        return MedioDePago.valueOf(s);
    }
}
