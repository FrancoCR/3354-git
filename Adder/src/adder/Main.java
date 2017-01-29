package adder;

public class Main 
{

    public static void main(String[] args) 
    {
        try 
        {
            int result = addArguments(args);
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.err.println("Please provide a list of integers to add");
        }
    }

    private static int addArguments(String[] args)
    {
        int i = 0;
	int j = 1;
	int addFinal =0;
	int argumentLength = args.length;
	if(args[0] == '-')
	{
	  addFinal = Integer.valueOf(args[0]) * -1;  
          i++;
	  while (i < argumentLength)
	  {
	   addFinal -= Integer.valueOf(args[i]);
	   i++
        }    
	else
	{
	 while (j < argumentLength)
	 {
	   addFinal += Integer.valueOf(args[i]) + Integer.valueOf(args[j]);
	   i++;
	   j++;
	 }
	}
        return addFinal;
    }
}
