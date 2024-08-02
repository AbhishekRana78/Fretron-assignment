import java.util.ArrayList;
import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        distributeApple();
    }

    public static void distributeApple() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> weights = new ArrayList<>();

        System.out.println("Enter apple weight in grams (-1 to stop): ");

        while (true) {
            int weight = scanner.nextInt();
            if (weight == -1) {
                break;
            }
            weights.add(weight);
        }

        int totalWeight = weights.stream().mapToInt(Integer::intValue).sum();
        int ramShare = (int) Math.round(totalWeight * 0.5); 
        int shamShare = (int) Math.round(totalWeight * 0.3);  
        // int rahimShare = totalWeight - ramShare - shamShare;  

        ArrayList<Integer> ramApples = new ArrayList<>();
        ArrayList<Integer> shamApples = new ArrayList<>();
        ArrayList<Integer> rahimApples = new ArrayList<>();

        weights.sort((a, b) -> Integer.compare(b, a)); 

        for (int weight : weights) {
            if (ramShare >= weight) {
                ramApples.add(weight);
                ramShare -= weight;
            } else if (shamShare >= weight) {
                shamApples.add(weight);
                shamShare -= weight;
            } else {
                rahimApples.add(weight);
            }
        }

        System.out.println("Distribution Result:");
        System.out.println("Ram: " + ramApples);
        System.out.println("Sham: " + shamApples);
        System.out.println("Rahim: " + rahimApples);
    }
}
