package DiceApp2;

public class Main {
    public static void main(){
        Game g = new Game();//Gameクラスのインスタンスを生成
        g.start();//Gameクラスのstartメソッドを呼び出す
        g.judge(null);//Gameクラスのjudgeメソッドを呼び出す
    }   
}
