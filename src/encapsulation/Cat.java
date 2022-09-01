package encapsulation;

public  class Cat
{
    private String name;
    private int speed;
    Cat(String name, int speed)
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
    boolean isDogNear(Dog dog)
    {
        return this.speed > dog.getSpeed();
    }
}