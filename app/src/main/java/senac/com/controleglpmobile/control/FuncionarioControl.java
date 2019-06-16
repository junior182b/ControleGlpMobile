package senac.com.controleglpmobile.control;

import android.app.Activity;
import android.widget.EditText;

import senac.com.controleglpmobile.model.atributes.Funcionario;

public class FuncionarioControl {

    private Activity activity;
    private EditText editNome;
    private EditText editCpf;
    private EditText editEmail;
    private EditText editTelefone;
    private EditText editLogin;
    private EditText editMatricula;

    private Funcionario funcionario = null;
    


    public FuncionarioControl(Activity activity) {
        this.activity = activity;
    }
}
