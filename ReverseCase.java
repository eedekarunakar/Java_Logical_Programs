public class ReverseCase{
   public static void main(String []args){
      char c = 0;
      String str = "lokesh";
      System.out.println("String in lowercase: "+str);
      // length of string
      int len = str.length();
      StringBuffer strBuffer = new StringBuffer(len);
      for (int i = 0; i < len; i++) {
         c = str.charAt(i);
         // title case converted to lower case
         if (Character.isTitleCase(c)) {
            c = Character.toLowerCase(c);
         }
         // upper case converted to lower case
         if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
         }
         // lower case converted to upper case
         if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
         }
         strBuffer.append(c);
      }
      System.out.println("Converting case: "+strBuffer.toString());
   }
}
