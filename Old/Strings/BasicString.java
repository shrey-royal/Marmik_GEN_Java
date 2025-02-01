public class BasicString {
    public static void main(String[] args) {
        String str1 = "Samosa";
        // String str2 = "Puff";   // 2498981
        String str3 = "Puff";

        // str2 = "Samosa";
        System.out.println(str1);
        // System.out.println(str2);
        System.out.println(str3);

        System.out.println("obj: " + str1.hashCode());
        // System.out.println("obj: " + str2.hashCode());
        System.out.println("obj: " + str3.hashCode());


    }
}