public class Cleric{
  String name;
  final int MAX_HP = 50;
  int hp = 50;
  final int MAX_MP = 10;
  int mp = 10;

  void selfAid(){
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した。");
  }

  int pray(int sec){
    System.out.println(this.name + "は" + sec +"秒祈った！");
    int recover = sec + new java.util.Random().nextInt(3);
    int recoverActual = Math.min(this.MAX_MP - this.mp,recover);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した。");
    return recoverActual;
  }
}