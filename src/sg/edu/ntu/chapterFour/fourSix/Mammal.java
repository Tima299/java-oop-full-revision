package sg.edu.ntu.chapterFour.fourSix;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString()+"]";
    }
}
