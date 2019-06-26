package senac.com.controleglpmobile.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import senac.com.controleglpmobile.R;
import senac.com.controleglpmobile.control.ClienteControl;
import senac.com.controleglpmobile.model.atributes.Cliente;

public class CadClienteActivity extends AppCompatActivity {

    private ClienteControl control;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_cliente);

        control = new ClienteControl(this);

    }
    public void cadastrar (View v){control.cadastrarAction();};
}
