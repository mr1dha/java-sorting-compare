/**
    @author Muhammad Ridha
    @since March 17th 2020
*/
    import java.util.Scanner;

public class Main{
    /**
        Main method
        @param String[] args
    */

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		Sorting<String> sort = new Sorting<String>();
		sort.getData();

        while(true){
            System.out.println("==== PEOGRAM KOMPARASI ALGORITMA SORTING ====\n");
            
            System.out.println("Pilih Metode Sorting:\n1) Bubble Sort\n2) Selection Sort\n3) Insertion Sort\n4) Keluar");
            System.out.print("\nPilihan : ");
            int pilihan = in.nextInt();

            switch(pilihan){
                case 1:
                  sort.bubbleSort(); break;

                case 2:
                  sort.selectionSort(); break;

                case 3:
                  sort.insertionSort(); break;

                case 4:
                    System.exit(1);

                default:
                    System.out.println("Input tidak sesuai"); break;
            }
        }
	}
}