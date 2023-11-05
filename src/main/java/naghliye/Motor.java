package naghliye;

public class Motor extends Naghliyeh{

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
