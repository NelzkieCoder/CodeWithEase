public class LessonOne {
    public static void main(String[] args) {
        char a = 'a';

        int x = 100000;

        float f = 10f; // or 10.0f

        double d = 100.013d;

        long l = 100000000L;

        byte b = 1;

        short s = 2000;

        boolean bool = true;

        char[] stringmadeofchars = {'h','e','l','l','o'};


        System.out.println("The char is " + a);
        System.out.println("The int is " + x);
        System.out.println("The float is " + f);
        System.out.println("The double is " + d);
        System.out.println("The long is " + l);
        System.out.println("The byte is " + b);
        System.out.println("The short is " + s);
        System.out.println("The boolean is " + bool);


        String helloString = new String(stringmadeofchars);
        System.out.println("Our string is " + helloString);
    }
}
