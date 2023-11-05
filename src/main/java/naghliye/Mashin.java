package naghliye;

class Mashin extends Naghliyeh implements GearBox, GonjayeshSandogh{

    int gonjayeshSandogh;
    String gearBox;

    public Mashin(){
        System.out.println("Make Car");
    }

    public Mashin(String mark){
        System.out.println("Make Car " + mark);
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshSandogh, String gearBox) {
       this.mark = mark;
       this.gonjayeshSandogh = gonjayeshSandogh;
       this.gearBox = gearBox;
    }


    public boolean OnIt(){
        System.out.println("Its ON!");
        return itsON;
    }

    @Override
    public String gearBoxType() {
        return "AUTOMATIC";
    }

    @Override
    public int gonjayesh() {
        return 120;
    }

    @Override
    public String getMark() {
        return mark;
    }
}
