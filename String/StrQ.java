public class StrQ {
    public static void main(String[] args) {
        String str = "Rable Blue";
//        String str1 = "AnkitKumar";
//        String str2 = "Rable Blue";

//        System.out.println(str.equals(str1)+" "+str.equals(str2));
//        String str3 = "Aplnacollage";
//        System.out.println(str3.replace("l",""));

//        String str1 = "hello";
//        String str2 = new String("hello");
//        StringBuilder builder = new StringBuilder();
//        System.out.println(str1 == str2); // false
//        System.out.println(str1 == str2.intern()); // true
//        System.out.println(str1 == builder(str1));

        StringBuffer sb = new StringBuffer();

        // Append strings
//        System.out.println("old : "+sb);
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println("new : "+sb);

        // Insert a string at a specific position
        sb.insert(0, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Replace a part of the string
        sb.replace(6, 16, "Amazing");
        System.out.println("After replace: " + sb);

        // Delete a part of the string
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Convert to string
        String result = sb.toString();
        System.out.println("Final result: " + result);



    }
}
