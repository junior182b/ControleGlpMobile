package senac.com.controleglpmobile.dao;

import android.content.Context;

import senac.com.controleglpmobile.dao.helper.DaoHelper;

import senac.com.controleglpmobile.model.atributes.Produto;

public class ProdutoDao extends DaoHelper<Produto> {
    public ProdutoDao(Context c) {
        super(c, Produto.class);
    }
}
