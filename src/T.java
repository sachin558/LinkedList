import java.security.PublicKey;

public class T {
    private static String name;
    private static int a;
    public T(String c, int d){
       name=c;
        a=d;
    }
    static void display(){
        System.out.println(" Name "+name+" "+a);
    }

    public static void main(String[] args) {
        T obj=new T("sachin",90);
        display();
    }
}
