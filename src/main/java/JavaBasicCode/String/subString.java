package JavaBasicCode.String;

import org.apache.poi.hssf.record.NoteRecord;

public class subString {

    public static void main(String[] args) {
     //   String s = "Hello World";

//        String subString = s.substring(5);
//        System.out.println("subString"+subString);

        // trim()  It is String method to avoid starting and ending space..
        //toUpperCase() Covert Uppercase alphabates
        //toLowerCase() Covert  Lowercase alphabates

        //replace("Hello","Hii");  replace the string and new variable create

        String name = "Akshay Deshmane";

        System.out.println(name.substring(1,12)); //always return subsquence

        System.out.println(name.subSequence(1, 12)); //always return subsquence

        //Example Leet Code 58 Given Example return the count hows last string count

        String s = " Hello World ";

        String str = s.trim();

        int count = 0;

       /* Note
        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i) != "") its "" or '' because char ' ' (extra spance need to gives) not working ne {*/

        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i) != ' ') {
                count ++ ;
            } else {
                break;
            }
        }
        System.out.println("result "+count);






    }
}
