/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

//Var args in action
public class Test {
    public static void main(String[] args) {
        test("Insert into Customer values(?,?,?,?)",10,"",true);
    }

    public static void test(String sql,Object... ob){
        System.out.println(sql);
        for (Object s : ob) {
            System.out.println(s);
        }
    }
}
