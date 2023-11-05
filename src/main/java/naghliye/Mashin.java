package naghliye;

public class Mashin extends Naghliyeh{

    public Mashin(){
        System.out.println("Make Car");
    }

    public Mashin(String mark){
        System.out.println("Make Car " + mark);
        this.mark = mark;
    }

    public boolean OnIt(){
        System.out.println("Its ON!");
        return itsON;
    }
}
