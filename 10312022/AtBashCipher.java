class AtBashCipher {
   private static String encipher(String s) {
      String cipherStr = "";
      for (int i = 0; i < s.length(); i++) {
         if (!Character.isLetter(s.charAt(i))) {
            cipherStr += s.charAt(i);
         } else if (Character.isLowerCase(s.charAt(i))) {
            cipherStr += (char) ((122 - (int) s.charAt(i)) + 97);
         } else {
            cipherStr += (char) ((90 - (int) s.charAt(i)) + 65);
         }
      }
      return cipherStr;
   }

   public static void main(String[] args) {
      System.out.println(encipher("apple"));
      System.out.println(encipher("Hello world!"));
      System.out.println(encipher("Christmas is the 25th of December."));
   }
}