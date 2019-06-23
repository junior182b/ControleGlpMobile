package senac.com.controleglpmobile.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.control.FuncionarioControl;

public class CadFuncActivity extends Activity {
    private FuncionarioControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_func);

        control = new FuncionarioControl(this);
    }

    public void cadastrar(View v){
        control.cadastrarAction();
    }

    public void cancelar(View v){
        control.cancelarAction();
    }

    public void voltar(View v){
        control.voltarAction();
    }
}
