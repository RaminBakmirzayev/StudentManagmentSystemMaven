package org.example.inter;

public interface ProcesService {

    public abstract void proces();
public default void procesLogic(){
    proces();
}

}
