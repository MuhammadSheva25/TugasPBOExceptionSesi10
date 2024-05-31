public class Exception5 {
    
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.err.println(bil/0);
        } catch (ArithmeticException e) {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.err.println("Ini menghandle error yang terjadi");
        }
    }
}
