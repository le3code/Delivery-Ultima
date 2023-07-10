package org.Ultima.domain.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DataEtempo {
    private Date data = new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public  String getDataDaEntrega() {

        System.out.println( sdf.format(data));
        String datas = sdf.format(data);
        return datas;
    }
}
