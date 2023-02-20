public class P5{
  public static void main(String[] args){
    // introduceOneseIf();
    // email("***について", "***@gmail.com", "***について相談があります。");
    // email("***@gmail.com", "***について相談があります。");
    System.out.println(calcTriangleArea(10.0,5.0));
    System.out.println(calcCircleArea(5.0));
  }

  public static void introduceOneseIf(){
    String name = "江﨑真旗";
    int age = 24;
    float tall = 165;
    char gender = '男';
    System.out.println(name + age + "歳、身長" + tall + "cmの" + gender + "性です。");
  }

  public static void email(String title, String address, String text){
    System.out.println("「" + address + "」に、以下のメールを送信しました");
    System.out.println("件名:「" + title + "」");
    System.out.println("本文:「" + text + "」");
  }

  public static void email(String address, String text){
    System.out.println("「" + address + "」に、以下のメールを送信しました");
    System.out.println("件名:無題");
    System.out.println("本文:「" + text + "」");
  }
  
  public static double calcTriangleArea(double bottom, double height){
    return bottom * height / 2;
  }
  
  public static double calcCircleArea(double radius){
    return radius * radius * 3.14;
  }
}