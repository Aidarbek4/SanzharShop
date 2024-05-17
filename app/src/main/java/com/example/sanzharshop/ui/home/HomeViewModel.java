package com.example.sanzharshop.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sanzharshop.models.ModelM;
import com.example.sanzharshop.repositories.JemRepository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private JemRepository jemRepository;
    private LiveData<List<ModelM>> modelMResponseLiveData;

    public HomeViewModel() {
        jemRepository = new JemRepository();
        modelMResponseLiveData = jemRepository.getDashJeminyList();
    }

    public LiveData<List<ModelM>> getModelMResponseLiveData() {
        return modelMResponseLiveData;
    }
}