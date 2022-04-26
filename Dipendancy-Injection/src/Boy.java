/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy implements DI {

    //Dependency Injection.. // How to inject dependencies to a class
    //property injection
    // we can use this, if we know the dependency before creating the Boy object
    //Agreement agreement= new Girl();

    Agreement agreement;

    //Constructor injection
    //We can use this, if we know the dependency at the time we create the Boy object
  /*  public Boy(Agreement a) {
        this.agreement = a;
    }*/

    public static void main(String[] args) {
       /* Boy boy = new Boy(new Girl());
        boy.chatWithGirl();*/

   /*     Boy boy = new Boy();
        boy.setInjection(new Girl());
        boy.chatWithGirl();*/

        Boy boy = new Boy();

        boy.chatWithGirl();
    }

    //Setter method injection
    // We can use this, if we know the dependency, just after creating the object
    public void setInjection(Agreement a) {
        this.agreement = a;
    }

    public void chatWithGirl() {
        //Loos coupling
        agreement.chat();
    }

    public void test() {
        agreement.chat();
    }

    @Override
    public void inject(Agreement a) {
        agreement = a;
    }


}
