package app.model.converter;

import app.model.entities.producto.estado.Pausa;
import app.model.entities.producto.estado.Activo;
import app.model.entities.producto.estado.Estado;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class EstadoConverter implements AttributeConverter<Estado, String> {
    @Override
    public String convertToDatabaseColumn(Estado estado) {
        if (estado.getClass().equals(Activo.class)) {
            return "Activo";
        } else {
            return "Pausa";
        }
    }
    @Override
    public Estado convertToEntityAttribute(String s) {
        if (s.equals("Activo")) {
            return Activo.getInstancia();
        } else {
            return Pausa.getInstancia();
        }
    }
}
