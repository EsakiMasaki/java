public class Question{
  public static void main(String[] args){
    String[] questions = {"経歴を中心に自己紹介をしてください。","前職に入社した理由はなんですか？"};
    int rand = new java.util.Random().nextInt(questions.length);
    System.out.println(questions[rand]);
  }
}