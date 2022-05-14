import java.util.Scanner;

 public class deneme{
    // public java tarafından erişilebildiğini gösteriyor
    //public classlar bütün paketler tarafından erişilebilir
    public static void main(String[] args) {
        int total = 0;
        int not;
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i<=5; i++){
            not = inp.nextInt();
            total+=not;
        }
        double avg = total/6;
        System.out.println(avg);
    }

}


