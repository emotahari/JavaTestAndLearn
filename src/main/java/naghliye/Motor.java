package naghliye;

public class Motor {
    boolean itsON;
    Ranande ranande;
    String mark;

    public void RoshanKon(){
        itsON = true;
    }
    void KhamushKon(){
        itsON = false;
    }
    public boolean OnIt(){
        if (itsON == true){
            System.out.println("Its ON!");
        return true;
    }else {
            System.out.println("Its OFF!");
        return false;
        }
    }
}
