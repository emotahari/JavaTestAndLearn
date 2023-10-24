package naghliye;

public class Mashin {
     boolean itsON;
     Ranande ranande;
     String mark;

    public Mashin(){
        System.out.println("Make Car");
    }

    public Mashin(String mark){
        System.out.println("Make Car " + mark);
        this.mark = mark;
    }
    void RoshnKon(){
        itsON = true;
    }
    void KhamushKon(){
        itsON = false;
    }
    public boolean OnIt(){
        System.out.println("Its ON!");
        return itsON;
    }
}
