import java.util.ArrayList;

public class Lineup {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold the full roster (10 players)
        ArrayList<String> roster = new ArrayList<String>();

        // Step 2: Add exactly 10 player names using .add()
        // The first 5 you add will be the starters; the last 5 will be the bench
        roster.add("Ben");
        roster.add("Shalev");
        roster.add("Shaya");
        roster.add("Henry");
        roster.add("Brandon");
        roster.add("Ori");
        roster.add("David");
        roster.add("Eli");
        roster.add("Tom");
        roster.add("Guy");


        // Step 3: Print a "STARTERS" label, then loop through and print the first 5 players
        // Each player should be numbered (Player 1, Player 2, etc.)
        System.out.println("--- STARTERS ---");
        for(int i=0; i <= roster.size()-6; i++){
            System.out.println("Player "+ (i+1) + ":" + roster.get(i));
        }
    

        // Step 4: Print a "BENCH" label, then loop through and print the last 5 players
        // Continue your numbering (Player 6, Player 7, etc.) OR restart at 1 — your choice
        System.out.println("--- BENCH ---");
        for(int i = 5; i<roster.size(); i++ ){
            System.out.println("Player "+ (1+i) + ":" + roster.get(i));

        }

        // Step 5: Print the total roster size using .size()
        System.out.println("Total Roster: " + roster.size() + " Players");

        
    }
}
