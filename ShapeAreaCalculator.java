import java.util.Scanner;

/*A class which calculates the shape of different areas on the basis of user input*/
class ShapeAreaCalculator{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        if(shape.equals("CIRCLE"))
        {
            System.out.println(3.14 * Math.pow(sc.nextFloat(), 2));
        }

        else if(shape.equals("TRIANGLE"))
        {
            System.out.println(0.5f * sc.nextFloat() * sc.nextFloat());
        }

        else if(shape.equals("SQUARE"))
        {
            System.out.println(Math.pow(sc.nextFloat(), 2));
        }

        else if(shape.equals("RECTANGLE"))
        {
            System.out.println(sc.nextFloat() * sc.nextFloat());
        }

        else
        {
            System.out.println("Enter Correct Shape Name");
        }
        sc.close();

    }
}