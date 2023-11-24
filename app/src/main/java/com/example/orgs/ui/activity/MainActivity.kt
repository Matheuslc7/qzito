package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.recyclerviweradapter.ListaProdutosAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Qzito"
        val descricao = findViewById<TextView>(R.id.descrição)
        descricao.text = "Short Hot BC"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "R$ 45,00"
        val qtd = findViewById<TextView>(R.id.quantidade)
        qtd.text = "500"
        val data = findViewById<TextView>(R.id.data)
        data.text = "24/11/2023"

        val recyclerView = findViewById<RecyclerView>(R.id.recycle)
        recyclerView.adapter = ListaProdutosAdapter()

    }

}