public class lab4_2 extends lab4_1 {
    private int playerNumber;
    private String position;

    public void setPlayerNumber(int n) {
        playerNumber = n;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPosition(String p) {
        position = p;
    }

    public String getPosition() {
        return position;
    }

    public boolean isSamePosition(lab4_2 p) {
        if((p.getPosition().equals(this.getPosition()))&
                (p.getTeam().equals(this.getTeam()))){
            return true;
        }else{
            return false;
        }
    }
}
