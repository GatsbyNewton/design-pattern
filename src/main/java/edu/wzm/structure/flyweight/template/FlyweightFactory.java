package edu.wzm.structure.flyweight.template;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        flyweightMap.put("X", new ConcreteFlyweight());
        flyweightMap.put("Y", new ConcreteFlyweight());
        flyweightMap.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweightMap.get(key);
    }
}
