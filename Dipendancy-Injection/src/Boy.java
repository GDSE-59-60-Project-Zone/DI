/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy {

    //Dependency Injection.. // How to inject dependencies to a class
    //property injection
    //Agreement agreement= new Girl();

    Agreement agreement;

    //Constructor injection
  /*  public Boy(Agreement a) {
        this.agreement = a;
    }*/


    //Setter method injection
    public void setInjection(Agreement a){
        this.agreement=a;
    }


    public void chatWithGirl() {
        //Loos coupling
        agreement.chat();
    }

    public void test() {
        agreement.chat();
    }


    public static void main(String[] args) {
       /* Boy boy = new Boy(new Girl());
        boy.chatWithGirl();*/

        Boy boy = new Boy();
        boy.setInjection(new Girl());
        boy.chatWithGirl();
    }
}
