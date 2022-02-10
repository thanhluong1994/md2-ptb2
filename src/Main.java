import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Nhap so a ");
        double a= scanner.nextDouble();
        System.out.print(" Nhap so b ");
        double b= scanner.nextDouble();
        System.out.print(" Nhap so c ");
        double c= scanner.nextDouble();
        QuadraticEquation delta =new QuadraticEquation(a,b,c);
        if(delta.getDiscriminant()>0){
            System.out.println("Phuong trinh co 2 nghiem la :" + delta.getR1() + " va " + delta.getR2());
        }
        if(delta.getDiscriminant()==0){
            System.out.println(" Phuong trinh co nghiem kep la : " + delta.getR1() );
        } if(delta.getDiscriminant()<0){
            System.out.println(" Phuong trinh vo nghiem ");
        }

    }
}
