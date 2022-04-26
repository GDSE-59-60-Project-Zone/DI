/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy {

    //property injection
    Agreement agreement= new Girl();



    public void chatWithGirl(){

//        //Tight coupling
//        Girl girl = new Girl();
//        girl.chat();


        //Loos coupling

        agreement.chat();
    }

    public void test(){
        agreement.chat();
    }



}
