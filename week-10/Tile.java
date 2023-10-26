import java.util.HashSet;
public class Tile implements Comparable<Tile>{
    private String name;
    private int weight;
    private int length;
    private int width;
    private int height;

    public Tile(String name, int weight, int length, int width, int height){
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int area(){
        int area = this.length * this.width;
        return area;
    }

    public int volume(){
        int volume = this.length * this.width * this.height;
        return volume;
    }

    //checking all contents of the objects
    @Override
    public boolean equals(Object x){
        Tile that = (Tile)x;
        return this.name.equals(that.name) &&
                this.weight == that.weight &&
                this.length == that.length &&
                this.width == that.width &&
                this.height == that.height;
    }

    //unique hashcode for each object
    @Override
    public int hashCode(){
        return this.name.length() + this.weight + this.length + this.width + this.height;
    }

    //THIS WEEK'S CODE
    public String getName(){
        return this.name;
    }

    //THIS WEEK'S CODE
    public int compareTo(Tile that){
        if(this.volume() > that.volume()){
            return 1;
        } else if(this.volume() < that.volume()){
            return -1;
        } else if(this.area() > that.area()){
            return 1;
        } else if(this.area() < that.area()){
            return -1;
        }else if(this.weight > that.weight){
            return 1;
        }else if(this.weight < that.weight){
            return -1;
        }else if(this.length > that.length){
            return 1;
        }else if(this.length < that.length){
            return -1;
        }else if(this.width > that.width){
            return 1;
        }else if(this.width < that.width){
            return -1;
        }else if(this.height > that.height){
            return 1;
        }else if(this.height < that.height){
            return -1;
        }else if(this.name.compareTo(that.name) > 0){
            return 1;
        }else if(this.name.compareTo(that.name) < 0) {
            return -1;
        }else{
            return 0;
        }
    }
}
