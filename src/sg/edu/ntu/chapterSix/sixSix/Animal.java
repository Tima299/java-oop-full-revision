package sg.edu.ntu.chapterSix.sixSix;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void greets(){
        System.out.println("Abstract Animal is making a sound");
    }
}
