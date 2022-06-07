package stringsLesson;

public class M4StringAssignment {


    public static void main(String[] args) {

        M4StringAssignment strings = new M4StringAssignment();
        strings.compareStrings("Category", "Cat");
        M4StringAssignment isPalindrome = new M4StringAssignment();
        isPalindrome.isPalindrome("abba");


    }

    public void compareStrings(String a, String b) {

        if (a == null || b == null) {
            System.out.println(" Cannot compare Strings");
        } else if (a.contains(b)) ;
        {
            System.out.println("Cat is the part of Category");
        }
        if (a.equals(b)) ;
        {
            System.out.println("The Strings are the same");

        }
    }

    public void isPalindrome(String abc) {
            if (abc == null || abc.isEmpty() || abc.isBlank()) {
            System.out.println("The String is null or empty");
        } else {

            System.out.println(String.format("The input string is %s", abc));
            String result = "";
            int lastLetter = abc.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                result = result + abc.charAt(i);
            }
            System.out.println(result);

        }
    }


}





