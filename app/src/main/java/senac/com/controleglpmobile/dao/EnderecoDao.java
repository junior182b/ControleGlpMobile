package senac.com.controleglpmobile.dao;

import android.content.Context;

import senac.com.controleglpmobile.dao.helper.DaoHelper;
import senac.com.controleglpmobile.model.atributes.Endereco;

public class EnderecoDao extends DaoHelper<Endereco>{

    public EnderecoDao(Context c) {
        super(c, Endereco.class);
    }
}
