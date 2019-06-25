package senac.com.controleglpmobile.control;


import android.app.Activity;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.sql.SQLException;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.dao.ClienteDao;
import senac.com.controleglpmobile.model.atributes.Cliente;
import senac.com.controleglpmobile.view.CadClienteActivity;

public class ClienteControl {

    private Activity activity;
    private EditText editNome;
    private EditText editCnpj;
    private EditText editrazaoS_cliente;
    private EditText editFone;
    private EditText editCep;
    private EditText editLogradouro;
    private EditText editBairro;
    private EditText editCidade;
    private EditText editEstado;
    private EditText editPais;
    private ListView lvClientes;
    private ArrayAdapter<Cliente> adapterCliente;

    private Cliente cliente;
    private ClienteDao clienteDao;

    public ClienteControl(Activity activity) {
        this.activity = activity;
        clienteDao = new ClienteDao(this.activity);
        initComponents();
        montarListView();

    }

    public void initComponents(){
        editNome = activity.findViewById(R.id.editNome);
        editCnpj = activity.findViewById(R.id.editCnpj);
        editrazaoS_cliente = activity.findViewById(R.id.editRazaoS);
        editFone = activity.findViewById(R.id.editFone);
        editCep = activity.findViewById(R.id.editCep);
        editLogradouro = activity.findViewById(R.id.editLogradouro);
        editBairro = activity.findViewById(R.id.editBairro);
        editCidade = activity.findViewById(R.id.editCidade);
        editEstado = activity.findViewById(R.id.editEstado);
        editPais = activity.findViewById(R.id.editPais);

    }
    public void montarListView(){
        try {
            adapterCliente = new ArrayAdapter<>(
                    activity,
                    android.R.layout.simple_list_item_1,
                    clienteDao.getDao().queryForAll()
            );
            lvClientes.setAdapter(adapterCliente);
//         cliqueCurto();
//            cliqueLongo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarAction (){
        Intent it = new Intent (activity, CadClienteActivity.class);
    }
}
