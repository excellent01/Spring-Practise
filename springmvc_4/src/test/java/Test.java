/**
 * @auther plg
 * @date 2019/8/27 17:02
 */
public class Test {
    public static void main(String[] args) {
        String str = "/a/b/c.txt";
        System.out.println(str.lastIndexOf("."));
        System.out.println(str.substring(str.lastIndexOf(".")));
    }
}
