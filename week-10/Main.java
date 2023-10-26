import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        /*
        Please note: I've made comments that distinguish this week's activity from last week's.

        Observations: After converting the hashSet into a treeSet, I immediately noticed that the code is now ordered
        from smallest to greatest (ascending order), whereas before it was random. In other words,
        it goes from the smallest volume to greatest.
        However, if the volume is the same, it makes sure to sort the tiles with same volume by alphabetical order.
        This is a result of my compareTo() function that I implemented from the Comparable interface inside my
        Tile.java file. Converting the treeSet into an arrayList had no effect on the ordering, but by converting it
        into an arraylist, you now have arraylist methods at your disposal! To answer number 5 of the assignment,
        if we didn't implement Comparable, then you wouldn't get the Comparable interface in your java class.
        This would prevent you from writing out the compareTo method. Also, if you didn't have any compareTo method
        at all, the ordering of the tiles would be the same as if you were ordering a hashSet, random.
         */

        Tile t1 = new Tile("Brick", 100, 25, 25, 30);
        Tile t2 = new Tile("Brick", 100, 25, 25, 30);
        Tile t3 = new Tile("Steel", 200, 30, 30, 40);

        //THIS WEEK'S CHANGES
        Tile t4 = new Tile("Marble", 0, 0, 0, 0);
        Tile t5 = new Tile("Slate", 400, 50, 50, 60);
        Tile t6 = new Tile("Ceramic", 1, 2, 3, 4);
        Tile t7 = new Tile("Wood", 1, 2, 3, 4);

        HashSet<Tile> tiles = new HashSet<Tile>();

        boolean addResult1;
        boolean addResult2;
        boolean addResult3;

        System.out.println("-------------------------------------------------------");
        System.out.println("LAST WEEK'S OUTPUT: \n" );

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

        //THIS WEEK'S CHANGES
        tiles.add(t4);
        tiles.add(t5);
        tiles.add(t6);
        tiles.add(t7);

        //Only two objects printed out. This is right as tile 2 was not added.
        System.out.println("Traversed hashset: ");
        for(Tile tileType : tiles){
            System.out.println(tileType.getName() + " with volume of " + tileType.volume());
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("THIS WEEK'S OUTPUT: \n");

        //THIS WEEK'S CHANGES.
        TreeSet<Tile> treeTile = new TreeSet<Tile>(tiles);
        System.out.println("Traversed tree set: ");
        for(Tile tileType : treeTile){
            System.out.println(tileType.getName() + " with volume of " + tileType.volume());
        }
        System.out.println();

        //THIS WEEK'S CHANGES
        ArrayList<Tile> arrayTile = new ArrayList<Tile>(treeTile);
        System.out.println("Traversed array list: ");
        for(Tile tileType : arrayTile){
            System.out.println(tileType.getName() + " with volume of " + tileType.volume());
        }
    }
}

/* Expected Output:
/Users/justintran/Library/Java/JavaVirtualMachines/openjdk-20.0.2/Contents/Home/bin/java -javaagent:/Applications
/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49945:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
-Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/justintran/F23-CS49J/Week-10-In-Class-Activity
-Justin-Tran/out/production/Week-10-In-Class-Activity-Justin-Tran Main

-------------------------------------------------------
LAST WEEK'S OUTPUT:

Tile 1 added: true
Tile 1 hashcode: 185

Tile 2 added: false
Tile 2 hashcode: 185

Tile 3 added: true
Tile 3 hashcode: 305

Traversed hashset:
Steel with volume of 36000
Ceramic with volume of 24
Slate with volume of 150000
Marble with volume of 0
Brick with volume of 18750
Wood with volume of 24
-------------------------------------------------------
THIS WEEK'S OUTPUT:

Traversed tree set:
Marble with volume of 0
Ceramic with volume of 24
Wood with volume of 24
Brick with volume of 18750
Steel with volume of 36000
Slate with volume of 150000

Traversed array list:
Marble with volume of 0
Ceramic with volume of 24
Wood with volume of 24
Brick with volume of 18750
Steel with volume of 36000
Slate with volume of 150000

Process finished with exit code 0

 */