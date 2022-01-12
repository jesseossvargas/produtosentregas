package org.jesse.produtosentregas.ui.colaboradores;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ColaboradoresViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ColaboradoresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is colaboradores fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}