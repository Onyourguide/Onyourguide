public class Monster{
    public String name;
    public int HP;
    public int atk;
    public int lv;

    public void showDetail(){
        System.out.println("name : "+ name);
        System.out.println("HP : "+ HP);
        System.out.println("atk : "+ atk);
        System.out.println("lv : "+ lv);
    }
    public void attack(Player m){
        int n = (int) m.HP;
        if(n-atk >= 0)
            m.HP -= atk;
        else
            m.HP = 0;
    }
}