public class Question{
  public static void main(String[] args){
    String[] questions = {
      "経歴を中心に自己紹介をしてください。",
      "前職に入社した理由はなんですか?",
      "長所と短所を教えてください。",
      "転職を決めた理由を教えてください。",
      "エンジニアになろうと思ったきっかけを教えてください。",
      "ご志望動機を教えてください。",
      "今後のキャリアプランについて教えてください。",
      "プログラミングを学習して感じたこと。",
      "学生時代にしていた部活動を教えてください。",
      "趣味はなんですか?",
      "最近では何にお金を使いましたか?",
      "コミュニケーションは得意ですか?",
      "ポートフォリオでは何を作りましたか?",
      "チーム開発では何を担当しましたか?"
    };

    for (int i = 0; i < 5; i++){
      int rand = new java.util.Random().nextInt(questions.length);
      System.out.println(questions[rand]);
      new java.util.Scanner(System.in).next();
    }
  }
}