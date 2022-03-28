class Box
{
    double width, hight, depth;

    Box(double w, double h, double d)
    {
        this.width=w;
        this.hight=h;
        this.depth=d;
    }
    Box()
    {
        width=hight=depth=0;
    }
    Box(double len)
    {
        width=hight=depth=len;

    }
    double Volume()
    {
        return width*hight*depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box Mybox1 = new Box(10,20,30);
        Box Mybox2 = new Box();
        Box cube = new Box(7);
        double vol;
        vol=Mybox1.Volume();
        System.out.println("volume of Mybox1 is: "+vol);
        vol=Mybox2.Volume();
        System.out.println("volume of myBox2 is:" +vol);
        vol=cube.Volume();
        System.out.println("volume of cube is:" +vol);
    }
}
