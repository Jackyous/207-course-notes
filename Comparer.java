
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Comparer{

    public boolean compare(String a, String b){
        return a.equalsIgnoreCase(b);
    }
    public boolean compare(Object a , Object b){
        return a.equals(b);
    }
    public static void main(String[] args) {
        Comparer sc = new Comparer();
        String s1 = "hello";
        String s2 = "HELLO";
        Object o1 = s1;
        Object o2 = s2;
        System.out.println(sc.compare(s1, s2)+" "+sc.compare(o1,o2)+ " "+sc.compare(o1,s1));
        System.out.println(sc.compare(o1,s1));
    }
}
