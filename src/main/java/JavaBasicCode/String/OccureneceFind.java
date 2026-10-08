package JavaBasicCode.String;

public class OccureneceFind {

    public static void main(String[] args) {
       String str = " Programming ";

       char key = 'g';
       int first = -1;
       int last = -1;

        String streamTrim = str.trim();
        for (int i = 0; i < streamTrim.length(); i++) {
            if (streamTrim.charAt(i) == key) {
               if (first == -1) {
                   first = i;
               } else {
                   last = i;
               }
            }
        }

        for (int i = streamTrim.length()-1; i >= 0 ; i --) {
            System.out.print(streamTrim.charAt(i));
        }
    }
}
