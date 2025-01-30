package Comparable;

public class Member {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getname() {return this.name;}

    public int getHeight() {return this.height;}

    @Override
    public String toString() {
        return this.getname() + " (" + this.getHeight() + ")";
    }

}
