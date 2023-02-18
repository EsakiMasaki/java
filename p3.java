public class P3{
  public static void main(String[] args){
    // 練習1
    /*weight == 60;
    (age1 + age2) * 2 > 60;
    age % 2 == 1;
    name.equals("湊");*/

    // 練習2
    // c d e

    // 練習3
    /*int seibetsu = 0;
    int age = 24;
    System.out.println("こんにちは。");
    if (seibetsu == 0){
      System.out.println("私は男です。");
      System.out.println(age + "歳です。");
    }else{
      System.out.println("私は女です。");
    }
    System.out.println("よろしくお願いします。");*/

    // 練習4
    /*boolean tenki = true;
    if (tenki == true){
      System.out.println("選択をします");
      System.out.println("散歩に行きます");
    }else{
      System.out.println("DVDを見ます");
      System.out.println("寝ます");
    }*/

    // 練習5
    /*System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }*/

    // 練習6
    System.out.println("[数当てゲーム]");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++){
      System.out.println("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("あたり！");
        break;
      }else{
        System.out.println("違います。");
      }
    }
    System.out.println("ゲームを終了します");
  }
}