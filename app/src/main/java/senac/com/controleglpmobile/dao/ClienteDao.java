package senac.com.controleglpmobile.dao;

import android.content.Context;

import senac.com.controleglpmobile.dao.helper.DaoHelper;
import senac.com.controleglpmobile.model.atributes.Cliente;

public class ClienteDao extends DaoHelper<Cliente> {
    public ClienteDao(Context c ) {
        super(c, Cliente.class);
    }
}
