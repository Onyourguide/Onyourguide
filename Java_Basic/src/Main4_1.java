public class Main4_1 {
    public static void main(String[] args) {
        lab4_1 p1 = new lab4_1();
        p1.setName("Bank");
        p1.setTeam("Gate OR");

        lab4_1 p2 = new lab4_1();
        p2.setName("Khim");
        p2.setTeam("Gate OR");

        if(p1.isSameTeam(p2)) {
            System.out.println(p1.getName() +" is a same team with "+p2.getName());
        } else
            System.out.println(p1.getName() +" is not a same team with "+p2.getName());
    }
}
