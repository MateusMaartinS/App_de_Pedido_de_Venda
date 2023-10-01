package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdicionarProduto extends AppCompatActivity {

    private EditText edDescricaoProduto;

    private EditText edValorUnitario;

    private Button btSalvarProduto;

    private Button btVoltarNvProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_produto);

        edDescricaoProduto = findViewById(R.id.edDescricaoProduto);
        edValorUnitario = findViewById(R.id.edValorUnitario);
        btSalvarProduto = findViewById(R.id.btSalvarProduto);
        btSalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarProduto();
            }
        });
        btVoltarNvProd = findViewById(R.id.btVoltarNvProd);
        btVoltarNvProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarPaginainicial();
            }
        });
    }

    private void salvarProduto() {
        int valor;
        if(edValorUnitario.getText().toString().isEmpty()){
            edValorUnitario.setError("O valor do Produto deve ser informado!");
            return;
        }else{
            try {
                valor = Integer.parseInt(edValorUnitario.getText().toString());
            }catch (Exception ex){
                edValorUnitario.setError("Informe um valor válido (somente números)!");
                return;
            }
        }
        if (edDescricaoProduto.getText().toString().isEmpty()){
            edDescricaoProduto.setError("A descrição do Produto deve ser informada!");
            return;
        }

        Produto produto = new Produto();

        produto.setValorUnitario(valor);
        produto.setDescricao(edDescricaoProduto.getText().toString());

        Controller.getInstance().salvarProduto(produto);

        Toast.makeText(AdicionarProduto.this," Produto cadastrado com sucesso!", Toast.LENGTH_LONG).show();

        finish();

    }


    private void voltarPaginainicial() {
        Intent voltarParaMain = new Intent(AdicionarProduto.this, MainActivity.class);

        startActivity(voltarParaMain);
    }

}