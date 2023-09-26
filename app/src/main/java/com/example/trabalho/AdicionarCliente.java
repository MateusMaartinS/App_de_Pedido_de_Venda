package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AdicionarCliente extends AppCompatActivity {

    private EditText edNomeCliente;

    private EditText edCPFCliente;

    private Button btSalvarCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_cliente);

        edNomeCliente = findViewById(R.id.edNomeCliente);
        edCPFCliente = findViewById(R.id.edCPFCliente);
        btSalvarCliente = findViewById(R.id.btSalvarCliente);
        btSalvarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarCliente();
            }
        });

        atualizarLista();

    }

    private void salvarCliente() {
        int Cpf;
        if(edCPFCliente.getText().toString().isEmpty()){
            edCPFCliente.setError("O CPF do cliente deve ser informado!");
            return;
        }else{
            try {
                Cpf = Integer.parseInt(edCPFCliente.getText().toString());
            }catch (Exception ex){
                edCPFCliente.setError("Informe um CPF válido (somente números)!");
                return;
            }
        }
        if (edNomeCliente.getText().toString().isEmpty()){
            edNomeCliente.setError("O nome do cliente deve ser informado!");
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setCPF(Cpf);
        cliente.setNome(edNomeCliente.getText().toString());

        Controller.getInstance().salvarCliente(cliente);

        Toast.makeText(AdicionarCliente.this," Cliente Cadastrado com Sucesso!", Toast.LENGTH_LONG).show();

        finish();
    }



    }


}