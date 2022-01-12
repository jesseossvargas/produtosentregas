package org.jesse.produtosentregas.ui.entregas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EntregasViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public EntregasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is entregas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}