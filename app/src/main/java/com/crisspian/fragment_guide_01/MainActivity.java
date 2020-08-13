package com.crisspian.fragment_guide_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.crisspian.fragment_guide_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
    }
     /*   binding.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarFragmento();
            }
        });*/

    public void mostrarFragmento(View view){
        //Genero la instancia del fragmento gracis alñ factoory metodo
        FirstFragment firstFragment = FirstFragment.newInstance("","");
        //obtener instancias del fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Obtener e instanciamos la una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment,firstFragment).addToBackStack(null).commit();

}
}