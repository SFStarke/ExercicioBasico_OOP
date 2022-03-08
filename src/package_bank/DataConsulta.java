package package_bank;

import java.text.DateFormat;
import java.util.Date;
import interface_date.Data;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class DataConsulta implements Data {

    @Override //Método de sobreposição toString.
    public String Data() {
        Date data = new Date();
        DateFormat form = DateFormat.getDateInstance(DateFormat.SHORT);
        return form.format(data);
    }

}
