package home_practice;

public class StringMethod {

    public static void main(String[] args) {
        String s1 = "This is my first String";
        String s2 = "This is my second String";
        String s3 = "";

        int l = s1.length();//length()is method (which found length of the string
        System.out.println(l);
        System.out.println(s2.length());//directly we can call s2 without any declare variable value

        System.out.println(s1.contains("first"));//true if characters are found
        System.out.println(s1.contains("second"));//false

        System.out.println(s1.equals(s2));//false because both String are not right
        System.out.println(s1.isEmpty());//false because s1 is not false
        System.out.println(s3.isEmpty());////true because s3 is blank
        System.out.println(s1.charAt(3));//give the "s" because in word This s is on 3rd position it will start with o123
        System.out.println(s1.concat(" computer"));// it combines this word at the end of the statement
        System.out.println(s1.startsWith("computer"));//check if this string start with "computer" or given word or not its gives true or false answer
        System.out.println(s1.endsWith("Prime"));//if this string end with that word or not.its give true or false
        System.out.println(s1.indexOf("my"));//return index of given character value of substring
        System.out.println(s1.replace("This","That"));//replace old character to new
        System.out.println(s1.substring(8));//sentence will print from that index number
        System.out.println(s1.toCharArray());//its convert string  into character array
        System.out.println(s1.toLowerCase());//Convert string into lowercase
        System.out.println(s1.toUpperCase());//convert lowercase into uppercase
        System.out.println(s1.trim());//eliminates leading and trailing spaces (means remove extra space)
    }
}
