import java.util.Random;
import java.util.Scanner;
//import java.io.*; (used for non-working names)

//Used to initalize base structures
interface Creature {
    String getName();
    void live();
}
//class to create a feature of life and death, and naming.
class Life implements Creature {
    private int survivalChance;
    private int replication;

    //this creates a chance for life and death
    public Life() {
        Random random = new Random();
        survivalChance = random.nextInt(10) + 1;
        replication = random.nextInt(10) + 1;
    }

    @Override
    public String getName() {
        return "Silas E. Hawthorne";
        //I gave up on the names.txt cause I always would get exceptions 🙀
    }

    //used to show creature is alive
    @Override
    public void live() {
        System.out.println(getName() + " is living.");
    }

    //other instances of life and death chance created to be used in world
    public int getSurvivalChance() {
        return survivalChance;
    }

    public boolean isAlive() {
        return survivalChance > 5;
    }

    public int replicateChance() {
        return replication;
    }

    public boolean shouldDie() {
        return replication < 5;
    }
}

//main functon to create the world
public class world extends Life {
    private static int creatureCount = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueSimulation = true;

        while (continueSimulation) {

            Life creature = new Life();
            //creates a chance for replication of the creature
            if (creature.replicateChance() > 5) {
                Creature newCreature = new Life();
                newCreature.live();
                creatureCount++;
            } else {
                //choosed the death of a creature in the simulation
                System.out.println(creature.getName() + " has died.");
                creatureCount--;
            }
            System.out.println("Total number of creatures in the world: " + creatureCount);
            System.out.print("Continue simulation? (y/n): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                continueSimulation = false;
            }
        }

        scanner.close();
    }
}

/*
 * failed name stuff
 * 
 * private static void scanInput() {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("name.txt")))) {
            s.useDelimiter(",\\s");
            while (s.hasNext()) {
                names.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

 */