package com.projetofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SegundoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_segundo, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.btn_ir_terceira_tela).setOnClickListener(v -> {
            FragmentManager manager = getActivity().getSupportFragmentManager();
            TerceiroFragment terceiroFragment = new TerceiroFragment();
            manager.beginTransaction()
                    .setCustomAnimations(R.anim.entrada_direira_para_esquerda,
                            R.anim.saida_direita_para_esquerda,
                            R.anim.entrada_esquerda_para_direita,
                            R.anim.saida_esquerda_para_direita)
                    .replace(R.id.frame, terceiroFragment)
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        });

        getView().findViewById(R.id.btn_primeira_voltar).setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().popBackStack();
        });
    }
}
