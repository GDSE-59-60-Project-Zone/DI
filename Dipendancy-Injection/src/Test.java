/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

//Var args in action
public class Test {
    public static void main(String[] args) {
        test("Insert into Customer values(?,?,?,?)",10,"IJSE",true);
    }

    public static void test(String sql,Object... ob){ // we can set optional params after sql by using var args
        System.out.println(sql);
        for (Object s : ob) {
            System.out.println(s);
        }
    }
}
