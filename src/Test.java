/**
 * on 17-8-28
 * created by wills
 */
public class Test {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        int b = 10;
        if(a == b)
            System.out.println("a == b");
        if(a.equals(b))
            System.out.println("a equals b");
        System.out.println("Integer a = " + a);
        System.out.println("int b = " + b);
    }
}
