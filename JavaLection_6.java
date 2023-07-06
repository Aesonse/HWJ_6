package Java_lection.Lectoin_6;

import java.util.HashMap;
import java.util.Iterator;


public class JavaLection_6 {
    public static void main(String[] args) {
        MyHashSet myobj = new MyHashSet();//????//
        System.out.println(myobj.add(1));
        System.out.println(myobj.add(2));
        System.out.println(myobj.add(1));
//        System.out.println(myobj.del(1));
//        System.out.println(myobj.del(2));
 //       System.out.println(myobj.del(1));
        System.out.println(myobj.isEmpty());

        Iterator<Integer> iterator = myobj.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }
    
    }
    
}


class MyHashSet {
    private HashMap<Integer, Object> myHs = new HashMap<>();

    private static final Object MyObj = new Object();
    public boolean add(int elem){
        return myHs.put(elem, MyObj) == null;
    }
    public Iterator<Integer> iterator() {
        return myHs.keySet().iterator();
    }
    public boolean del(int elem){
        return myHs.remove(elem) == MyObj;
    }
    public boolean isEmpty(){
        return myHs.isEmpty();
    }

    public boolean contains(int elen){
        return myHs.containsKey(elen);
    }
    public int get(int index) {
        Object[] a = myHs.keySet().toArray();
        return(int) a [index];
    }
}