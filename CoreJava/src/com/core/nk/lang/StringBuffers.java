package com.core.nk.lang;

public class StringBuffers {
   public static void main(String[] args) {
      StringBuffer stringBuffer = new StringBuffer();

      stringBuffer.append("Hello").append(", I'm home !");
      String newStr = stringBuffer.toString();
      System.out.println(newStr);

      stringBuffer = new StringBuffer(newStr);

      stringBuffer.append(" What's for dinner ??");

      System.out.println(stringBuffer);


      StringBuilder sb = new StringBuilder();

      sb.append("Hello").append(", I'm home !");
      String newStrSb = sb.toString();
      System.out.println(newStrSb);

      sb = new StringBuilder(newStrSb);

      sb.append(" What's for dinner ??");

      System.out.println(sb);

   }
}
