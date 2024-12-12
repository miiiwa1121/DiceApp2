package DiceApp2;

public class Game {
    Player p1;//Player1クラスのインスタンスを保持
    Player p2;//Player2クラスのインスタンスを保持
    Dice d1;//Dice1クラスのインスタンスを保持
    Dice d2;//Dice2クラスのインスタンスを保持


    Game(){
        p1 = new Player();//Player1クラスのインスタンスを生成
        p2 = new Player();//Player2クラスのインスタンスを生成
        d1 = new Dice();//Dice1クラスのインスタンスを生成
        d2 = new Dice();//Dice2クラスのインスタンスを生成
    }

    void start(){
        p1.turn(d1);//Player1クラスのturnメソッドを呼び出す
        System.out.println("Player1 : "+d1.me);//Diceクラスのmeフィールドを表示
        p2.turn(d2);//Player2クラスのturnメソッドを呼び出す
        System.out.println("Player2 : "+d2.me);//Diceクラスのmeフィールドを表示
    }
    void judge(Player p){
            if(d1.me == d2.me){
                System.out.println("あいこ");
            }
            else if(d1.me > d2.me){
                System.out.println("Win Player1");
            }
            else{
                System.out.println("Win Player2");
            }
        }
    
}
