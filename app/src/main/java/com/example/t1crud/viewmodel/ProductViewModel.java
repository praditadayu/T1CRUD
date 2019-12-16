package com.example.t1crud.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.example.t1crud.database.ProductRepository;
import com.example.t1crud.entity.Product;

import java.util.List;

public class ProductViewModel extends AndroidViewModel {

    private ProductRepository mRepository;

    private LiveData<List<Product>> mAllProduct;

    public ProductViewModel (Application application) {
        super(application);
        mRepository = new ProductRepository(application);
        mAllProduct = mRepository.getAllProducts();
    }

    public LiveData<List<Product>> getmAllProduct() { return mAllProduct; }

    public void insert(Product product) { mRepository.insert(product); }
    public void update(Product product) { mRepository.update(product); }
    public void delete(Product product) { mRepository.delete(product); }
}