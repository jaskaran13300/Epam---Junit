public class StringTest {
    private String str;
    public StringTest(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }



 public String fun() {
     StringBuilder s = new StringBuilder(str);
     if (str.length() == 1) {
         if (str.charAt(0) == 'A')
             return "";
         else
             return str;
     } else {
         char ch = str.charAt(0);
         char ch1 = str.charAt(1);
         if (ch1 == 'A' && ch == 'A') {
             s.deleteCharAt(0);
             s.deleteCharAt(0);

         } else if (ch == 'A') {
             s.deleteCharAt(0);

         } else if (ch1 == 'A') {
             s.deleteCharAt(1);

         }
         return s.toString();
     }
 }
}

