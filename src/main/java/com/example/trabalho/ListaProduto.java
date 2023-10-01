package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaProduto extends AppCompatActivity {

    private TextView tvListaProduto;

    private Button btVoltarListProd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produto);

        tvListaProduto = findViewById(R.id.tvListaProduto);
        btVoltarListProd = findViewById(R.id.btVoltarListProd);
        btVoltarListProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarPaginaInicial();
            }
        });
        atualizarLista();

    }

    private void voltarPaginaInicial() {
        Intent voltarParaMain = new Intent(ListaProduto.this, MainActivity.class);

        startActivity(voltarParaMain);
    }
    private void atualizarLista() {
        String texto = "";
        ArrayList<Produto> lista = Controller.getInstance().retornarProduto();
        for (Produto produto : lista) {
            texto += " ID: " + produto.getIdProduto() + " Valor Unitario: R$" + produto.getValorUnitario() + "\n Descrição: " + produto.getDescricao() + "\n";
        }
        tvListaProduto.setText(texto);
    }

}