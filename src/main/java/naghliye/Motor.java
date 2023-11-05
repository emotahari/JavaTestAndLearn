package naghliye;

public class Motor extends Naghliyeh{
    String mark = "Motor";

    public Motor() {
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
    public String getMark() {
        return "Motor";
    }
}
