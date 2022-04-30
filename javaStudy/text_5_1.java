package javaStudy;

public class text_5_1 {
  public static void main(String[] args) {
    String s = "Hello World";
    char[] a = s.toCharArray();
    StringBuffer sb = new StringBuffer();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (a[i] >= 'a' && a[i] <= 'z') {
        sb.append(String.valueOf(a[i]).toUpperCase());
      } else if (a[i] >= 'A' && a[i] <= 'Z') {
        sb.append(String.valueOf(a[i]).toLowerCase());
      }
    }
    System.out.println(sb.toString());
  }
}