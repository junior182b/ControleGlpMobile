package senac.com.controleglpmobile.control;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collections;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.dao.FuncionarioDao;
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

    private Funcionario funcionario = null;
    private FuncionarioDao funcDao;
    


    public FuncionarioControl(Activity activity) {
        this.activity = activity;
        funcDao = new FuncionarioDao(this.activity);
        initComponents();
    }

    private void initComponents(){
        editNome = activity.findViewById(R.id.editNome);
        editCpf = activity.findViewById(R.id.editCpf);
        editEmail = activity.findViewById(R.id.editEmail);
        editFone = activity.findViewById(R.id.editFone);
        editLogin = activity.findViewById(R.id.editLogin);
        editMatricula = activity.findViewById(R.id.editMatricula);
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

        if (funcionario.getNome().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_nome, Toast.LENGTH_LONG).show();
            editNome.requestFocus();
            return;
        }else if (funcionario.getCpf().trim().isEmpty()){
            Toast.makeText(activity, R.string.erro_cpf, Toast.LENGTH_LONG).show();
            editCpf.requestFocus();
            return;
        }
    }

    public void cancelarAction(){

    }
}
