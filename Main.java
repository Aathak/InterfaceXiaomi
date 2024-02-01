import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Phone RedmiNote8 = new Xiaomii();
        
        PhoneUser Atha = new PhoneUser(RedmiNote8);
        
        Atha.TurnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while (true) {
            System.out.println("==== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("----------------------------");
            System.out.print("Pilih aksi> ");
            aksi =input.nextLine();
            
            if (aksi.equalsIgnoreCase("1")){
                Atha.TurnOnThePhone();
            } 
            else if (aksi.equalsIgnoreCase("2")){
                Atha.TurnOffThePhone();
            }
            else if (aksi.equalsIgnoreCase("3")){
                Atha.MakePhoneLouder();
            }
            else if (aksi.equalsIgnoreCase("4")){
                Atha.MakePhoneSilent();
            }
            else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }
            else {
                System.out.println("Aksimu salah");
            }
        }
    }
    
}
