public class Memo{
  public static void main(String[] args){
    System.out.println("今日は休もう！");
    System.out.println("どうやら疲れているようだ。");
    double heat = 36.0 + new java.util.Random().nextDouble();
    System.out.println("熱を測ると" + (Math.round(heat * 10)) / 10.0 + "だった");
    heat = (Math.round(heat * 10)) / 10.0;
    if (heat > 36.7){
      System.out.println("ねろ");
    }else{
      System.out.println("勉強しろ");
    }
  }
}