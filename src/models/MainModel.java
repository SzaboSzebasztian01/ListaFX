package models;

import java.util.ArrayList;

public class MainModel {
    ArrayList<Fruit> fruitList;

    public MainModel() {
        this.fruitList = new ArrayList<>();
        this.initFruit();

    }

    private void initFruit(){
        fruitList.add(new Fruit("alma", 1));
        fruitList.add(new Fruit("szilva", 1));
        fruitList.add(new Fruit("körte", 1));
        fruitList.add(new Fruit("barack", 1));
        fruitList.add(new Fruit("banán", 2));
        fruitList.add(new Fruit("cineal", 2));

    }

    public ArrayList<Fruit> getFruits(){

        return this.fruitList;

    }
    
}
