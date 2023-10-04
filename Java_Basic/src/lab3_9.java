public class lab3_9 {
    public static void main(String[] args){
        Player p1 = new Player();
        p1.name = "Alex" ;
        p1.HP = 1000 ;
        p1.atk = 20 ;
        p1.lv = 5 ;


        Monster m1 = new Monster();
        m1.name = "poo1" ;
        m1.HP = 100 ;
        m1.atk = 10 ;
        m1.lv = 3 ;

        Monster m2 = new Monster();
        m2.name = "poo2" ;
        m2.HP = 120 ;
        m2.atk = 12 ;
        m2.lv = 5 ;

        p1.attack(m1);
        p1.attack(m2);
        m1.attack(p1);
        m2.attack(p1);

        p1.showDetail();
        m1.showDetail();
        m2.showDetail();
    }
}
