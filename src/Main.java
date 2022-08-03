import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutTutar,elmaTutar,domatesTutar,muzTutar,patlicanTutar,toplam;



        Scanner scn=new Scanner(System.in);

        System.out.println("Armut kaç kilo?: ");
        armutKilo=scn.nextDouble();

        System.out.println("Elma kaç kilo?: ");
        elmaKilo=scn.nextDouble();

        System.out.println("Domates kaç kilo?: ");
        domatesKilo=scn.nextDouble();

        System.out.println("Muz kaç kilo?: ");
        muzKilo=scn.nextDouble();

        System.out.println("Patlican kaç kilo?: ");
        patlicanKilo=scn.nextDouble();

        armutTutar=armut*armutKilo;
        elmaTutar=elma*elmaKilo;
        domatesTutar=domates*domatesKilo;
        muzTutar=muz*muzKilo;
        patlicanTutar=patlican*patlicanKilo;
        toplam=armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;

        System.out.println("Toplam tutar: "+toplam);


    }
}
