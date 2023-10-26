import java.util.HashSet;
public class Main {
    public static void main(String[] args) {

        //Observations
        /*Upon first running my code without my overridden equals and hashCode function in my
        tile.java class, all three tile objects were added to the hashSet. This was incorrect as t1
        and t2 contain the same contents. I believe this was an error since the default equals method
        was only performing a shallow equality check. The fix I then made was creating a deep equality check
        function inside my Tile class. After doing so, only tile 1 and tile 3 were added to the hashSet.
        Additionally, I added a hashCode function to ensure that the same objects had the same hashCodes.
        The code below reflects my code corrections.
         */

        Tile t1 = new Tile("Brick", 100, 25, 25, 30);
        Tile t2 = new Tile("Brick", 100, 25, 25, 30);
        Tile t3 = new Tile("Steel", 200, 30, 30, 40);

        HashSet<Tile> tiles = new HashSet<Tile>();

        boolean addResult1;
        boolean addResult2;
        boolean addResult3;

        //Tile 1 added
        addResult1 = tiles.add(t1);
        System.out.println("Tile 1 added: " + addResult1);
        System.out.println("Tile 1 hashcode: " + t1.hashCode());
        System.out.println();

        //Tile 2 not added since it's the same as Tile 1
        //Hashcode is the same as tile 1's
        addResult2 = tiles.add(t2);
        System.out.println("Tile 2 added: " + addResult2);
        System.out.println("Tile 2 hashcode: " + t2.hashCode());
        System.out.println();

        //Tile 3 added since it's different from the other tiles
        addResult3 = tiles.add(t3);
        System.out.println("Tile 3 added: " + addResult3);
        System.out.println("Tile 3 hashcode: " + t3.hashCode());
        System.out.println();

        //Only two objects printed out. This is right as tile 2 was not added.
        System.out.println("Printed out contents of hashSet: ");
        for(Tile tileType : tiles){
            System.out.println(tileType);
        }

        //Expected Output
        /*/Users/justintran/Library/Java/JavaVirtualMachines/openjdk-20.0.2/Contents/Home/bin/java -javaagent:
        /Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49588:/Applications/IntelliJ IDEA.app/Contents
        /bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users
        /justintran/F23-CS49J/Week-9-In-Class-Activity-Justin-Tran/out/production
        /Week-9-In-Class-Activity-Justin-Tran Main

        Tile 1 added: true
        Tile 1 hashcode: 185

        Tile 2 added: false
        Tile 2 hashcode: 185

        Tile 3 added: true
        Tile 3 hashcode: 305

        Printed out contents of hashSet:
        Tile@131
        Tile@b9

        Process finished with exit code 0
        */

    }
}