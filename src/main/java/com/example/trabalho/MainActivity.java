package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btNovoCliente;

    private Button btListaCliente;

    private Button btNovoProduto;

    private Button btListaProduto;

    private Button btNovaVenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNovoCliente = findViewById(R.id.btNovoCliente);
        btNovoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirNovoCliente();
            }
        });
        btListaCliente = findViewById(R.id.btListaCliente);
        btListaCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirListaCliente();
            }
        });
        btNovoProduto = findViewById(R.id.btNovoProduto);
        btNovoProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirNovoProduto();
            }
        });
        btListaProduto = findViewById(R.id.btListaProduto);
        btListaProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirListaProduto();
            }
        });
        btNovaVenda = findViewById(R.id.btNovaVenda);
    }

    private void abrirListaProduto() {
        Intent abrirListaProduto = new Intent(MainActivity.this, ListaProduto.class);

        startActivity(abrirListaProduto);
    }

    private void abrirListaCliente() {
        Intent abrirListaClientes = new Intent(MainActivity.this, ListaCliente.class);

        startActivity(abrirListaClientes);
    }

    private void abrirNovoCliente() {
        Intent abrirAddCliente = new Intent(MainActivity.this, AdicionarCliente.class);

        startActivity(abrirAddCliente);
    }

    private void abrirNovoProduto(){
        Intent abrirAddProduto = new Intent(MainActivity.this, AdicionarProduto.class);

        startActivity(abrirAddProduto);
    }
}