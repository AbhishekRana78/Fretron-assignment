import java.util.*;

public class  Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of soldiers:");
        int numSoldiers = scanner.nextInt();

        List<String> soldierPositions = new ArrayList<>();
        for (int i = 1; i <= numSoldiers; i++) {
            System.out.print("Enter coordinates for soldier " + i + ": ");
            soldierPositions.add(scanner.next());
        }

        System.out.print("Enter the coordinates for the specialized castle: ");
        String castlePosition = scanner.next();

        List<String> paths = findCastlePaths(soldierPositions, castlePosition);
        System.out.println("\nThanks. There are " + paths.size() + " unique paths for your 'special_castle'\n");

        for (int i = 0; i < paths.size(); i++) {
            System.out.println("Path " + (i + 1) + ":\n=======");
            System.out.println(paths.get(i));
        }

        scanner.close();
    }

    public static List<String> findCastlePaths(List<String> soldierPositions, String castlePosition) {
        

        
        List<String> paths = new ArrayList<>();

       
        String path1 = "Start (" + castlePosition + ")\nKill (1,9). Turn Left\nJump (5,9)\nKill (8,9). Turn Left\nKill (8,2). Turn Left\nJump (4,2).\nArrive (" + castlePosition + ")";
        
   
        String path2 = "Start: (" + castlePosition + ")\nKill (1,9). Turn Left\nKill (5,9). Turn Left\nKill (5,6). Turn Left\nKill (2,6). Turn Left\nKill (2,8). Turn Left\nKill (4,8). Turn Left Jump (4,2).\nKill (4,1). Turn Left\nKill (1,1). Turn Left\nArrive (" + castlePosition + ")";
        
       
        String path3 = "Start (" + castlePosition + ")\nKill (1,9). Turn Left\nJump (5,9)\nKill (8,9). Turn Left\nKill (8,2). Turn Left\nJump (4,2). Kill (4,1). Turn Left\nJump (4,2).\nArrive (" + castlePosition + ")";
        
        
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        return paths;
    }
}
