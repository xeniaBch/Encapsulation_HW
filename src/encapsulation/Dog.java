package encapsulation;

public class Dog {
    private String name;
    private int speed;
    Dog(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }
    //it is getter, it must be public
    public String getName()
    {
        return name;
    }
    //it is getter, it must be public
    public int getSpeed()
    {
        return speed;
    }
    boolean isCatNear(Cat cat)
    {
        return this.speed > cat.getSpeed();
    }
}