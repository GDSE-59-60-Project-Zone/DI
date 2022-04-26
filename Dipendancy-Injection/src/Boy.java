/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy {

    //Dependency Injection.. // How to inject dependencies to a class
    //property injection
//    Agreement agreement= new Girl();

    Agreement agreement;

    public Boy(Agreement a) {
        this.agreement = a;
    }

    public Boy() {
    }

    public void chatWithGirl() {
        //Loos coupling
        agreement.chat();
    }

    public void test() {
        agreement.chat();
    }


    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
