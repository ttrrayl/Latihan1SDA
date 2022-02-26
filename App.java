import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList <String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("t");
        nama.add("m");
        nama.add("a");

        System.out.println("Pilihan yang tersedia : ");
        System.out.println("1. Fungsi isEmpty");
        System.out.println("2. Fungsi size");
        System.out.println("3. Fungsi get");
        System.out.println("4.Fungsi indexOf");
        System.out.println("5. Fungsi remove");
        System.out.println("6. Fungsi add");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = input.nextInt();

        switch(pilih){
            case 1 :
            //fungsi isEmpty
                if (nama.isEmpty()==true){
                     System.out.println("Array dalam kondisi kosong");
                 }
                else {
                    System.out.println("Array tidak dalam kondisi kosong");
                }
            break;

            case 2 : 
            //fungsi size
            System.out.println("Ukuran array adalah : "+nama.size());
            break;

            case 3 :
             //fungsi get
            System.out.println(nama.get(0));
            System.out.println(nama.get(2));
            System.out.println(nama.get(6));
            System.out.println(nama.get(-3));
            break;

            case 4 :
            //fungsi indexOf
            System.out.println(nama.indexOf("a"));
            System.out.println(nama.indexOf("c"));
            System.out.println(nama.indexOf("q"));
            break;

            case 5 :
            //fungsi remove
            System.out.println(nama);
            nama.remove(0);
            System.out.println(nama);
            nama.remove(3);
            System.out.println(nama);
            nama.remove(2);
            System.out.println(nama);
            break;

            case 6 :
             //fungsi add
            System.out.println(nama);
            nama.add(0,"e");
            System.out.println(nama);
            nama.add(2,"f");
        System.out.println(nama);
        nama.add(3,"g");
        System.out.println(nama);
        nama.add(4,"h");
        System.out.println(nama);
        nama.add(6,"h");
        System.out.println(nama);
        nama.add(-3,"j");
        System.out.println(nama);
        break;

        default :
        System.out.println("pilihan tidak tersedia");

        }

       
    }
}
