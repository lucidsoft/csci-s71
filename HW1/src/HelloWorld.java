
public class HelloWorld
{
    public static void main(String[] args)
    {
        //Handle invalid number of app arguments
        if (0 == args.length)
        {
            //Report error and output hint to proper usage of app.
            System.out.println("Error: Invalid number of arguments specified");
            System.out.println("Proper Usage is: java HelloWorld yourname");

            //Stop app run with exit code
            System.exit(-1);
        }

        //Output app result
        System.out.print("Hello, " + args[0] + "!");
    }
}
