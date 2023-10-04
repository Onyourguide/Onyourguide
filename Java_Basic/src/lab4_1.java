public class lab4_1 {
    private String name;
    // Attribute = Modifier DataType AttributeName [= value];
    private String team;

    public void setName(String n){
        // Method Setter = Modifier DataType setAttributeName (dataType arg) {}
        name = n;
        // attributeName =  arg;
    }
    public String getName(){
        // Metthod Getter = Modifier DataType get Attribute(){}
        return name;
        // return attributeName;
    }

    public void setTeam(String t){
        team = t;
    }

    public String getTeam(){
        return team;
    }

    public boolean isSameTeam(lab4_1 p){
        return team.equals(p.getTeam());
        // Method รับค่า p จาก lab4_1 เพื่อเปรียบเทียบ attribute team ของ object ที่ใช้งาน method และ object p ที่รับการเปรียบเทียบ
        /* team.equals(p.getTeam()); เปรียบเทียบค่าของ attribute team ของ Object เรียกใช้งาน method(getTeam) กับ
        attribute team ของ object p ที่รับเปรียบเทียบ ถ้าค่าทั้งสองเหมือนกันจะคืนค่า true มิฉะนั้นจะคืนค่า false  */
    }

}
