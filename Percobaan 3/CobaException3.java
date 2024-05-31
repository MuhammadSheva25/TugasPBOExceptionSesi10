public class CobaException3 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.err.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.err.println("Terjadi Aritmatika error");
        }
        catch(Exception e)
        {
            System.err.println("Ini menghandle error yang terjadi");
        }
    }
}
