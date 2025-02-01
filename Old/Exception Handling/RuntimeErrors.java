public class RuntimeErrors {
    public static void main(String[] args) {
        // String str = null;
        System.out.println("Before Exception");

        // try {
        //     System.out.println(2/0);
        //     System.out.println(str.length());
        // } catch(Exception e) {
        //     e.printStackTrace();
        // }
        // catch(ArithmeticException e) {
        //     // System.out.println(e.getMessage());
        //     e.printStackTrace();
        // } catch(NullPointerException e) {
        //     e.printStackTrace();
        // }

        String str = "123s";
        try {
            System.out.println(str.charAt(89));
            // System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

        System.out.println("After Exception");
    }
}