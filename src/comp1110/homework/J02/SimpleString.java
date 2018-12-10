package comp1110.homework.J02;

public class SimpleString {
    public static void main(String[] args) {
        String s = "";
        System.out.println(s);
        s = "Foo";
        System.out.println(s);
        s = "Bar";
        System.out.println(s);
        s += "!";
        System.out.println(s);

    }
}
//Within the `comp1110.homework.J02` package of the `comp1110-homework`
//        project, create a class `SimpleString` that does the following steps:
//        * it declares an String, `s` and initializes it to empty string (`''`)
//        * it  prints out `s` (using `system.out.println()`)
//        * it assigns `"Foo"` to `s` (use the `=` sign for assignment)
//        * it prints out `s`
//        * it assigns `"Bar"` to `s`
//        * it prints out `s`
//        * it concatenates a `"!"` to the end of `s` (use the `+` symbol for string concatenation)
//        * it prints out `s`
//
//        Test your solution using the `J02` test.
//
//        Once you have it working, add and commit your work.
