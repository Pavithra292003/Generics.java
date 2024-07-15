		GENERIC CLASS

class Generic<t>
{
    t i;

    Generic(t i)
    {
        this.i=i;

    }
    public t input()
    {
        return this.i;
        
    }
}
public class Generics {
    public static void main(String args[]) {
        Generic<Integer>obj=new Generic<Integer>(10);
        System.out.println(obj.input());
        Generic<String>abc=new Generic<String>("ERODE");
        System.out.println(abc.input());
    }
}

		ANOTHER WAY


class Generic<t,u>
{
    t i;
    u s;
    Generic(t i,u s)
    {
        this.i=i;
        this.s=s;
    }
    public void input()
    {
        System.out.println(i);
        System.out.println(s);
    }
}
public class Genericsclass {
    public static void main(String args[]) {
        Generic<Integer,String>obj=new Generic<Integer,String>(10,"ERODE");
        obj.input();

    }
}

		GENERIC FUNCTION
public class GenericFunction{
     static <r> void display(r input) {
         System.out.println(input.getClass().getName() + "=" + input);
     }
    public static void main(String args[]) {
         display(2.5);
    display(10);
    display("OOTY");

    }
}
