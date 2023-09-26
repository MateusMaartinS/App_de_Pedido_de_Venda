package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ListaCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cliente);

        atualizarLista()
    }
    private void atualizarLista(){
        String texto = "";
        ArrayList<Cliente> lista = Controller.getInstance().retornarCliente();
        for (Cliente cliente: lista){
            texto += "CPF: "+cliente.getCPF()+ " Nome: "+ cliente.getNome()+"\n";
        }

}