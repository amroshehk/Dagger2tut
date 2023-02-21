package com.example.dagger2tut;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder suger(int suger);
        CoffeeComponent build();
    }
}
