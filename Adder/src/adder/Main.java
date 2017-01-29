package adder;

public class Main {

    public static void main(String[] args) 
    {
        try 
        {
            int result = addArguments(args);
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.err.println("Input is invalid" + "/nThere are not enough integers to add or subtract(-)");
        }
    }

    private static int addArguments(String[] args)
    {
        int i = 0;
	    int j = 1;
	    int addFinal =0;
	    int argumentLength = args.length;
	    while (j < argumentLength)
	    {
	      addFinal = Integer.valueOf(args[i]) + Integer.valueOf(args[j]);
	      i++;
	      j++;
	    }
	    return addFinal;
    }
}
