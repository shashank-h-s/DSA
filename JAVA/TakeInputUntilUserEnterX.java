import java.util.Scanner;
class TakeInputUntilUserEnterX{

    static void takeInputUntillUserEnterX() {
            Scanner sc =new Scanner(System.in);
            int result =0;
            System.out.println("enter only integer and to exit enter 'x' ");
            while(true) {
                String n =sc.next();
                if(n.equals("x") || n.equals("X")) {
                    break;
                }
                else {
                    int a=Integer.valueOf(n);
                    result +=a;
                }
            }
            sc.close();
            System.out.println(result);
        }
    public static void main(String[] args) {
        takeInputUntillUserEnterX();
    }
}