package org.example.inter;


import org.example.bean.Config;

public interface SaveableProces extends ProcesService {
    @Override
    public default void procesLogic(){
        proces();
        Config.saveToFile();
    }
}
