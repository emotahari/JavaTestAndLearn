package naghliye;

public class Ranande {
    private String noeGavahiname = "Paye 1";
    private static String nam = "Farhad";

    //Non-static Nested Class : Inner Class
    public class    Gavahiname {
        public void  print(){
            System.out.println("Class Non Static");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }
    }


    //static Nested Class
    public static class    StaticGavahiname {
        public void  print(){
            System.out.println("Class Non Static");
//            System.out.println(noeGavahiname);        چون استتیک نیست نستت کلاس استتیک نمیتواند استفاده کند چون
//            استتیک ها فقط یکبار و در زمان کامپایل تایم درست میشود و بقیه اجزا در زمان ران تایم ساخته میشوند
            System.out.println(nam);
        }
    }
}
