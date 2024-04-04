package com.fernandocruz.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.fernandocruz.whatsapplist.Adapter.AdapterUsuario;
import com.fernandocruz.whatsapplist.Model.Usuario;
import com.fernandocruz.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_usuario;
    private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_usuario = findViewById(R.id.recycler_usuarios);

        recycler_usuario.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        recycler_usuario.setHasFixedSize(true);
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        recycler_usuario.setAdapter(adapterUsuario);

        Usuarios();

        // Evento de click na recyclerView
        recycler_usuario.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recycler_usuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Usuario usuario = usuarioList.get(position);
                        Toast.makeText(getApplicationContext(),"Usuário: " + usuario.getNome(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Usuario usuario = usuarioList.get(position);
                        Toast.makeText(getApplicationContext(),"Usuário: " + usuario.getNome(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }
        ));
    }

    public void Usuarios(){

        Usuario usuario1 = new Usuario(R.drawable.usuario1,"Marcos","Olá, como vai?");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2,"Bruna", "Olá, como vai?");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario1,"Pedro","Vou na sua casa amanhã");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario(R.drawable.usuario2,"Bianca","Estou bem e você?");
        usuarioList.add(usuario4);

        Usuario usuario5 = new Usuario(R.drawable.usuario1,"João Silva","oi");
        usuarioList.add(usuario5);

        Usuario usuario6 = new Usuario(R.drawable.usuario2, "Maria Clara","Vamos ao shopping depois do almoço?");
        usuarioList.add(usuario6);

        Usuario usuario7 = new Usuario(R.drawable.usuario1,"Cleber","Como vocÊ está?");
        usuarioList.add(usuario7);

        Usuario usuario8 = new Usuario(R.drawable.usuario2,"Letícia","Muito obrigada :)");
        usuarioList.add(usuario8);

        Usuario usuario9 = new Usuario(R.drawable.usuario1,"Felipe Rodrigues", "Foi nuito legal ontem.");
        usuarioList.add(usuario9);

        Usuario usuario10 = new Usuario(R.drawable.usuario2,"Janaina","Bom fim de semana para você");
        usuarioList.add(usuario10);

        Usuario usuario11 = new Usuario(R.drawable.usuario1,"Mário","Olá, Letícia! Tudo bem?");
        usuarioList.add(usuario11);

        Usuario usuario12 = new Usuario(R.drawable.usuario2,"Ana","Oi!");
        usuarioList.add(usuario12);


    }

}