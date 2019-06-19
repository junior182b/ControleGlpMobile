package senac.com.controleglpmobile.view;

import android.app.Activity;
import android.os.Bundle;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.control.FuncionarioControl;

public class FuncionarioActivity extends Activity {

    private FuncionarioControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionario);

        control = new FuncionarioControl(this);
    }
}
