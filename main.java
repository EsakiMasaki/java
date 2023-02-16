public class Main{
  //クラスブロック
  public static void main(String[] args){
    //メソッドブロック
    final double TAX = 1.1;
    int fax = 5;
    System.out.println("5万円から4万円に値下げします。");
    // TAX = 4; ←定数にすることで間違えに気づく
    fax = 4;
    System.out.println("FAXの新価格(税込)");
    System.out.println(TAX * fax + "万円");
  }
}