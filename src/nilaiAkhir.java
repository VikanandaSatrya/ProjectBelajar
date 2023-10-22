import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args){
    Scanner jumlahSoalObj = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Soal: ");

    int jumlahSoal = jumlahSoalObj.nextInt();

    Scanner jumlahSectionbObj = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Sesi: ");

    int jumlahSection = jumlahSectionbObj.nextInt();

    boolean conditition = true;
    while(conditition == true){

        int a = 0;
        int b = 0;

        for(int i = 0; i < jumlahSection; i++){
            System.out.println("Section " + (i+1));

            Scanner benarSesiIniObj = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Benar: ");

            int benarSesiIni = benarSesiIniObj.nextInt();

            if(i == 0){
                a = benarSesiIni;
                System.out.println("Benar sesi ini " + a);
            }else{
                if(b == 0){
                    b = benarSesiIni + a;
                    System.out.println("Benar sesi ini " + b);
                }else{
                    b = benarSesiIni + b;
                    System.out.println("Benar sesi ini " + b);
                }
            }

        }
        int jumlahBenar = b;

        Nilai siswa = new Nilai(jumlahBenar, jumlahSoal);





        double nilaiAkhir = ((double)jumlahBenar/jumlahSoal) * 100;
        siswa.setNilaiAkhir(nilaiAkhir);
        System.out.println(nilaiAkhir);
        System.out.println(jumlahBenar + "/" + jumlahSoal);

        System.out.println();

        Scanner isDoneObj = new Scanner(System.in);
        System.out.print("Ingin memasukkan nilai lagi? (y/n): ");

        String isDone= isDoneObj.nextLine();
        if(isDone.equals("n")){
            break;
        }
    }
    }
}