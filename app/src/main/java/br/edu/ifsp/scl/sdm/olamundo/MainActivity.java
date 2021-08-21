package br.edu.ifsp.scl.sdm.olamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textoET;
    private Button cliqueAquiBt;
    private Spinner opcoesSp;
    private CheckBox selecionadoCb;
    private RadioButton radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoET = findViewById(R.id.textoET);
        cliqueAquiBt = findViewById(R.id.cliqueAquiBt);
        opcoesSp = findViewById(R.id.opcoesSp);
        selecionadoCb = findViewById(R.id.selecionadoCb);
        radio = findViewById(R.id.radio1Rb);

        cliqueAquiBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder();

        //EditText
        sb.append(textoET.getText().toString());
        sb.append('\n');

        //Spinner
        sb.append(((TextView) opcoesSp.getSelectedView()).getText());
        sb.append('\n');

        //CheckBox
        sb.append(selecionadoCb.isChecked() ? "Selecionado" : "Não Selecionado");
        sb.append('\n');

        //CheckBox
        sb.append(radio.isChecked() ? "Radio 1" : "Radio 2");
        sb.append('\n');

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}