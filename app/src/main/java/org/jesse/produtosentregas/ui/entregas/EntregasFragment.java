package org.jesse.produtosentregas.ui.entregas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import org.jesse.produtosentregas.R;
import org.jesse.produtosentregas.ui.entregas.EntregasViewModel;

import java.util.ArrayList;
import java.util.List;

public class EntregasFragment extends Fragment {

    private EntregasViewModel entregasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        entregasViewModel =
                new ViewModelProvider(this).get(EntregasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_entregas, container, false);
        entregasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        EditText textoNovoEnderecoEntrega = root.findViewById(R.id.editTextEntregaEndereco);
        EditText textoNovoProdutosEntrega = root.findViewById(R.id.editTextEntregaProdutos);
        EditText textoNovoColaborador = root.findViewById(R.id.editTextEntregaColaborador);
        Button botaoNovaEntrega = root.findViewById(R.id.botaoInserirEntrega);
        ListView listaEntregas = root.findViewById(R.id.listaEntregas);
        final List<String> listEntregas = new ArrayList<>();

        botaoNovaEntrega.setOnClickListener(v -> {
            listEntregas.add(textoNovoEnderecoEntrega.getText().toString() + ", " + textoNovoProdutosEntrega.getText().toString()
                    + ", " + textoNovoColaborador.getText().toString());
            carregaEntregas(listEntregas, listaEntregas);
        });

        return root;
    }

    private void carregaEntregas(List<String> entregas, ListView listaEntregas){
        int i = 0;
        ArrayAdapter<String> itensAdaptador = new ArrayAdapter(getActivity().getApplicationContext(),
                R.layout.row,
                android.R.id.text1,
                entregas);

        listaEntregas.setAdapter(itensAdaptador);

    }
}