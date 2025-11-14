class X
{
  int a = getA();

  X()
  {
        show();
    }

    int getA()
    {
        return 10;
    }

    void show()
    {
        System.out.println("X: " + a);
    }
}

class Y extends X
{
    int a = getA();

    Y()
    {
        show();
    }

    int getA()
    {
        return 20;
    }

    void show()
    {
        System.out.println("Y: " +super.a);
    }
}

public class Staticblockfield
{
    public static void main(String[] args)
    {
        new Y();
    }
}
