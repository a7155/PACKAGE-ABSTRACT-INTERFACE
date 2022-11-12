/**
 *
 * @author 4715
 */
import java.util.Scanner;
public class TesLaptop {
    public static void main(String[] args) {
        
        // membuat objek HP
        Laptop laptop1 = new Toshiba();
        Laptop laptop2 = new MacBook();
        // membuat objek user
        LaptopUser ajis = new LaptopUser(laptop1);
        LaptopUser budi = new LaptopUser(laptop2);
        // kita coba nyalakan Laptopnya
        Scanner pilih = new Scanner(System.in);
        String act; 
        while (true) {
            System.out.println("=== Pilih Jenis Laptop ===");
            System.out.println("[1] Thosiba");
            System.out.println("[2] MacBook");
            System.out.println("[0] Exit");
            System.out.println("==========================");
            System.out.print("Pilih Option :");
            act = pilih.nextLine();
            
            if(act.equalsIgnoreCase("1")){
                ajis.turnOnLaptop();
                Scanner input = new Scanner(System.in);
                String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan Laptop");
            System.out.println("[2] Matikan Laptop");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Exit");
            System.out.println("==========================");
            System.out.print("Pilih Option :");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                ajis.turnOnLaptop();
            } else if (aksi.equalsIgnoreCase("2")){
                ajis.turnOffLaptop();
            } else if (aksi.equalsIgnoreCase("3")){
                ajis.makeLaptopLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                ajis.makeLaptopSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
            } else if (act.equalsIgnoreCase("2")){
                budi.turnOnLaptop();
                Scanner input = new Scanner(System.in);
                String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan Laptop");
            System.out.println("[2] Matikan Laptop");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Exit");
            System.out.println("==========================");
            System.out.print("Pilih Option :");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                budi.turnOnLaptop();
            } else if (aksi.equalsIgnoreCase("2")){
                budi.turnOffLaptop();
            } else if (aksi.equalsIgnoreCase("3")){
                budi.makeLaptopLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                budi.makeLaptopSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }    

    }
}
