package org.jesse.produtosentregas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bem Vindo Ao app de Produtos e Entregas!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}