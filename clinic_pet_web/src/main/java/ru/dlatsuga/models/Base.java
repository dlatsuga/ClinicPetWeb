package ru.dlatsuga.models;

/**
 * Created by Dima on 21.06.2015.
 */
public abstract class Base {
    protected int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
