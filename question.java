public class Question{
  public static void main(String[] args){
    String[] questions = {
      "経歴を中心に自己紹介をしてください。",
      "前職に入社した理由はなんですか？",
      "長所と短所を教えてください",
      "転職を決めた理由を教えてください",
      "エンジニアになろうと思ったきっかけを教えてください",
      "ご志望動機を教えてください",
      "今後のキャリアプランについて"
    };
    int rand = new java.util.Random().nextInt(questions.length);
    System.out.println(questions[rand]);
  }
}