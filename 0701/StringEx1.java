public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = str1;

//        System.out.println(str1==str2); //true
//        str1 += "test";
//        System.out.println(str1==str2); //false

        System.out.println(new String("abc")==new String("abc"));
        System.out.println(new String("abc").hashCode()==new String("abc").hashCode());
        System.out.println(new String("abc").hashCode());
    }
}
