package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lbRespuesta;
    private Button btnSaludo;
    private Button btnReset;
    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarVistas();

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtName.getText().toString().equals("")){
                    lbRespuesta.setText("hola "+txtName.getText()+", buenas tardes");
                    txtName.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "Pon texto bbo", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lbRespuesta.setText("");
            }
        });
    }

    private void inicializarVistas() {

        lbRespuesta=findViewById(R.id.lbRespuestaMain);
        btnReset=findViewById(R.id.btnResetMain);
        btnSaludo=findViewById(R.id.btnSaludoMain);
        txtName=findViewById(R.id.txtNameMain);

    }
}