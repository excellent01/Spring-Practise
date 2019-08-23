/**
 * @auther plg
 * @date 2019/8/9 20:56
 */
public class Test {
    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 5;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
