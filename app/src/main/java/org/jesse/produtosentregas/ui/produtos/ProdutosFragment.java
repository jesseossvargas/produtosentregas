package org.jesse.produtosentregas.ui.produtos;

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
import com.example.frutoxdelivery.ui.produtos.ProdutosViewModel;

import java.util.ArrayList;
import java.util.List;

public class ProdutosFragment extends Fragment {

    private ProdutosViewModel produtosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        produtosViewModel =
                new ViewModelProvider(this).get(ProdutosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_produtos, container, false);
        produtosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        EditText textoNovoProduto = root.findViewById(R.id.editTextTextPersonName7);
        Button botaoNovoProduto = root.findViewById(R.id.botaoInserirProduto);
        ListView listaProdutos = root.findViewById(R.id.listaProdutos);
        final List<String> listProdutos = new ArrayList<>();

        botaoNovoProduto.setOnClickListener(v -> {
            listProdutos.add(textoNovoProduto.getText().toString());
            carregaProdutos(listProdutos, listaProdutos);
        });

        return root;
    }

    private void carregaProdutos(List<String> produtos, ListView listaProdutos){
        int i = 0;
        ArrayAdapter<String> itensAdaptador = new ArrayAdapter(getActivity().getApplicationContext(),
                R.layout.row,
                android.R.id.text1,
                produtos);

        listaProdutos.setAdapter(itensAdaptador);

    }

}