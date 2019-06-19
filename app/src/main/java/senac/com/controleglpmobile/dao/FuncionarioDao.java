package senac.com.controleglpmobile.dao;

import android.content.Context;

import senac.com.controleglpmobile.dao.helper.DaoHelper;
import senac.com.controleglpmobile.model.atributes.Funcionario;

public class FuncionarioDao extends DaoHelper<Funcionario> {
    public FuncionarioDao(Context c) {
        super(c, Funcionario.class);
    }
}
