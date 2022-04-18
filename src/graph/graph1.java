package graph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class graph1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        obj.put(10,100);
//        obj.clear();
//        obj.clone();
        obj.containsKey(10);
        System.out.println(obj.get(10));
        System.out.println(obj.getOrDefault(2,0));
    }

}
