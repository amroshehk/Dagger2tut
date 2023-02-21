package com.example.dagger2tut;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    River getRiver(){
      return new River();
    }

}
