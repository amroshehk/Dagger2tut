package com.example.dagger2tut;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder suger(@Suger int suger);
        @BindsInstance
        Builder milk(@Milk int milk);
        CoffeeComponent build();
    }
}
