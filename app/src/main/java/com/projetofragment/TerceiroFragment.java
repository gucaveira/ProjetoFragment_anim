package com.projetofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TerceiroFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_terceiro, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().findViewById(R.id.btn_voltar_segunda_tela)
                .setOnClickListener(v -> getActivity().getSupportFragmentManager().popBackStack());


        getView().findViewById(R.id.btn_voltar_home).setOnClickListener(v -> getActivity()
                .getSupportFragmentManager().popBackStack("primeiro fragment", 0));
    }
}
