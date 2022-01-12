package org.jesse.produtosentregas.ui.colaboradores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import org.jesse.produtosentregas.R;

public class ColaboradoresFragment extends Fragment {

    private ColaboradoresViewModel colaboradoresViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        colaboradoresViewModel =
                new ViewModelProvider(this).get(ColaboradoresViewModel.class);
        View root = inflater.inflate(R.layout.fragment_colaboradores, container, false);
        final TextView textView = root.findViewById(R.id.text_colaboradores);
        colaboradoresViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}