import java.util.Scanner;
class Exercice1 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une naturel n:");
        int n = sc.nextInt();
        
        System.out.println("Voici les n premiers entiers strictement positifs:");
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        };
        System.out.println("Voici les n premiers entiers strictement positifs en ordre decroissant:");
        for(int i=n; i>=1; i--) {
            System.out.println(i);
        };
        System.out.println("Voici les n premiers carrés parfaits:");
        int cp = (int) Math.sqrt(n);
        for (int i=1; i<=n; i++) {
            if(cp*cp == i) {
                System.out.println(i);
            };
        };     
        System.out.println("Voici les n premiers entiers strictement positifs impairs:");
        for (int i=1; i<=n; i++) {
            if (i%2==1) {
                System.out.println(i);
            };
        }
        System.out.println("Voici les entiers strictement positifs impairs qui sont inférieurs ou égaux à n:");
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                System.out.println(i);
            };
        };
        
    }
}