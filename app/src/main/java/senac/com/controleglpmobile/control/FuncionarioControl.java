package senac.com.controleglpmobile.control;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.Collections;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.dao.FuncionarioDao;
import senac.com.controleglpmobile.model.atributes.Endereco;
import senac.com.controleglpmobile.model.atributes.Funcionario;
import senac.com.controleglpmobile.view.CadFuncActivity;
import senac.com.controleglpmobile.view.PesqFuncActivity;

public class FuncionarioControl {

    private Activity activity;
    private EditText editNome;
    private EditText editCpf;
    private EditText editEmail;
    private EditText editFone;
    private EditText editLogin;
    private EditText editMatricula;
    private EditText editCep;
    private EditText editLogradouro;
    private EditText editBairro;
    private EditText editCidade;
    private EditText editEstado;
    private EditText editPais;
    private ListView lvFuncionarios;
    private ArrayAdapter<Funcionario> adapterFunc;

    private Endereco endereco;
    private Funcionario funcionario = null;
    private FuncionarioDao funcDao;
    


    public FuncionarioControl(Activity activity) {
        this.activity = activity;
        funcDao = new FuncionarioDao(this.activity);
        initComponents();
    }

    private void montarListView(){
        try {
            adapterFunc = new ArrayAdapter<>(
                    activity,
                    android.R.layout.simple_list_item_1,
                    funcDao.getDao().queryForAll()
            );
            lvFuncionarios.setAdapter(adapterFunc);
            cliqueCurto();
            cliqueLongo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initComponents(){
        editNome = activity.findViewById(R.id.editNome);
        editCpf = activity.findViewById(R.id.editCpf);
        editEmail = activity.findViewById(R.id.editEmail);
        editFone = activity.findViewById(R.id.editFone);
        editLogin = activity.findViewById(R.id.editLogin);
        editMatricula = activity.findViewById(R.id.editMatricula);
        editCep = activity.findViewById(R.id.editCep);
        editLogradouro = activity.findViewById(R.id.editLogradouro);
        editBairro = activity.findViewById(R.id.editBairro);
        editCidade = activity.findViewById(R.id.editCidade);
        editEstado = activity.findViewById(R.id.editEstado);
        editPais = activity.findViewById(R.id.editPais);
    }

    public void chamaTelaCadFuncAction() {
        Intent it = new Intent(activity, CadFuncActivity.class);
        activity.startActivity(it);
    }

    public void chamaTelaPesqFuncAction() {
        Intent it = new Intent(activity, PesqFuncActivity.class);
        activity.startActivity(it);
    }

    public void voltarAction() {
        activity.finish();
    }

    public void cadastrarAction(){
        if (funcionario == null){
            funcionario = new Funcionario();
        }
        funcionario.setNome(editNome.getText().toString());
        funcionario.setCpf(editCpf.getText().toString());
        funcionario.setListEmail(Collections.singletonList(editEmail.getText().toString()));
        funcionario.setListTelefones(Collections.singletonList(editFone.getText().toString()));
        funcionario.setUsuario(editLogin.getText().toString());
        funcionario.setMatricula(editMatricula.getText().toString());
        endereco.setCep(editCep.getText().toString());
        endereco.setLogradouto(editLogradouro.getText().toString());
        endereco.setBairro(editBairro.getText().toString());
        endereco.setCidade(editCidade.getText().toString());
        endereco.setEstado(editEstado.getText().toString());
        endereco.setPais(editPais.getText().toString());
        funcionario.setEndereco(endereco);



        if (funcionario.getNome().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_nome, Toast.LENGTH_LONG).show();
            editNome.requestFocus();
            return;
        }else if (funcionario.getCpf().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_cpf, Toast.LENGTH_LONG).show();
            editCpf.requestFocus();
            return;
        }else if (funcionario.getUsuario().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_login, Toast.LENGTH_LONG).show();
            editCpf.requestFocus();
            return;
        }else if (funcionario.getMatricula().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_matricula, Toast.LENGTH_LONG).show();
            editCpf.requestFocus();
            return;
        }

        try {
            Dao.CreateOrUpdateStatus res = funcDao.getDao().createOrUpdate(funcionario);
            if (res.isCreated()){
                Toast.makeText(activity, R.string.cad_sucesso, Toast.LENGTH_LONG).show();
            }else if (res.isUpdated()){
                Toast.makeText(activity, R.string.edit_sucesso, Toast.LENGTH_SHORT).show();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        funcionario = null;
    }

    public void cancelarAction(){
        activity.finish();
    }

    private void cliqueCurto(){
        lvFuncionarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                funcionario = adapterFunc.getItem(position);
                AlertDialog.Builder alerta = new AlertDialog.Builder(activity);
                alerta.setTitle("Visualizando funcionarios");
                alerta.setMessage(funcionario.toString());
                alerta.setNeutralButton("Fechar", null);
                alerta.setPositiveButton("Editar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        editNome.setText(funcionario.getNome());
                        editCpf.setText(funcionario.getCpf());
                        editLogin.setText(funcionario.getUsuario());
                        editMatricula.setText(funcionario.getMatricula());
                    }
                });
                alerta.show();
            }
        });
    }

    private void cliqueLongo(){
        lvFuncionarios.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                funcionario = adapterFunc.getItem(position);
                AlertDialog.Builder alerta = new AlertDialog.Builder(activity);
                alerta.setTitle("Excluindo Funcionario");
                alerta.setMessage("Deseja realmente excluir o funcionario " + funcionario.getNome()+"?");
                alerta.setIcon(android.R.drawable.ic_menu_delete);
                alerta.setNeutralButton("Não", null);
                alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            funcDao.getDao().delete(funcionario);
                            adapterFunc.remove(funcionario);
                            funcionario = null;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                });
                alerta.show();
                return true;
            }
        });
    }

    public void pesquisarAction(){
        montarListView();
    }
}
