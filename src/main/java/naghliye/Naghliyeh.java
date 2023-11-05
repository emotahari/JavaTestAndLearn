package naghliye;

public abstract class Naghliyeh {
    boolean itsON;
    Ranande ranande;
    String mark;

    public void RoshanKon(){
        itsON = true;
    }
    void KhamushKon(){
        itsON = false;
    }


    public abstract String getMark();
}
