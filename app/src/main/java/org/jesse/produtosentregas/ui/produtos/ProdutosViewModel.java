package com.example.frutoxdelivery.ui.produtos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProdutosViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ProdutosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("PRODUTOS");
    }

    public LiveData<String> getText() {
        return mText;
    }
}