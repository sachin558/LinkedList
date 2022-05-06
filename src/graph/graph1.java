package graph;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class graph1 {
    Map<Integer, Integer> obj;

    graph1() {
        obj = new HashMap();
    }

    public void insert(int key, int value) {
        obj.put(key, value);
    }

    public void display() {
        for (Map.Entry<Integer, Integer> res : obj.entrySet()) {
            System.out.print(res.getKey()+" ");
            System.out.println(res.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        graph1 obj=new graph1();
        obj.insert(10,90);
        obj.insert(20,89);
        obj.display();
    }

}

//        HashMap<Integer,Integer> obj=new HashMap<>();
////        obj.put(10,100);
////        obj.put(20,200);
////        obj.put(30 ,400);
//////        obj.clear();
//////        obj.clone();
//////        obj.containsKey(10);
//////        System.out.println(obj.get(10));
//////        System.out.println(obj.getOrDefault(2,0));
////        for (Map.Entry<Integer,Integer> res: obj.entrySet()){
////            System.out.print(res.getKey() + " ");
////            System.out.println(res.getValue()+" ");
////        }
////    }
//

