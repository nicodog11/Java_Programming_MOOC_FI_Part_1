
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        //ArrayList<String> list = new ArrayList<>();

        int count = 0;
        int win = 0;
        int loss = 0;

        System.out.println("Team:");
        String searchedFor = scan.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
               //list.add(fileScan.nextLine());
                String line = fileScan.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);

                if(homeTeam.equals(searchedFor) || awayTeam.equals(searchedFor)){
                    count ++;
                }
                if(homeTeam.equals(searchedFor) && homeTeamScore > awayTeamScore){
                    win++;
                }else if(homeTeam.equals(searchedFor) && homeTeamScore < awayTeamScore){
                    loss++;
                }
                if(awayTeam.equals(searchedFor) && awayTeamScore > homeTeamScore){
                    win++;
                }else if(awayTeam.equals(searchedFor) && awayTeamScore < homeTeamScore){
                    loss++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }
}
