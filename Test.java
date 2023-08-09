import java.util.Properties;

class Test
{
    public static void printSystemProperties()
    {
        System.out.println("printing system properties");
         System.getProperties();
    }
    public static void main(String[] args)
    {
        System.out.println("java program strated");
       printSystemProperties();
    }
}