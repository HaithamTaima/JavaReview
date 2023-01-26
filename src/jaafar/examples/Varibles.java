package jaafar.examples;

public class Varibles {
    //instance variable
    int x;
    final static double good=3.40;
    public static void main(String[] args) {
        String x="java";
        System.out.println(x);
        String resrt=x.toUpperCase();

        double doular =78.3;
        double ext_ils =2.0;
        double rsrt = doular*ext_ils;

        String H =welcome("Haitham");
        String Y =sum(32,232);
        String K=sum((int) doular,(int) ext_ils );
        String set=set("hjhj **"," hjhg **"," ghghg");
        double sqer =sqr(5.9);
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println(set);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(sqer);
        int width =70;
        int height =30;
        int area =width*height;

        System.out.println(width*height);

        System.out.println("tha amont dolar "+doular +"="+rsrt+"ils");

        System.out.println(resrt);

        System.out.println(H);
        System.out.println(Y);
        System.out.println("------------------------------------");
        System.out.println(K);
        System.out.println("************************************");
        print("ddfd","fdddf");

        System.out.println(x.length());
    }
    public static String welcome(String string){
        return "hi :"+string;
    }
    public static String sum (int x, int y){
        int result =x+y;

        return "sum = "+result;
    }
    public static  String set(String string1,String string2,String string3){
        String conat =string1+"\n"+string2+"\n"+string3;
        return conat;
    }
    public static void print (String strng1,String strng2){
        System.out.println(strng1+"\t"+strng2);
        System.out.println(good);
    }
    public static double sqr(double nam){
        return nam*nam;
    }

}
