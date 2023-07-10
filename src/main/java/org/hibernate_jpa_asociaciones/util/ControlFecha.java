package org.hibernate_jpa_asociaciones.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlFecha {
    public String controlFecha(Date fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fechaConver = formato.format(fecha);
        return fechaConver;
    }
}
