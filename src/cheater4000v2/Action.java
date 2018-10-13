package cheater4000v2;

import java.util.LinkedList;

public class Action {
    public static int MOVE = 1;
    public static int WAIT = 2;
    public static int L_CLK = 3;
    public static int R_CLK = 4;
    public static int M_CLK = 5;
    public static int TYPE = 6;
    public static int DOWN_LEFT = 7;
    public static int UP_LEFT = 8;
    public static int USE_PASSWORD = 9;
    public static int LOOP = 10;
    public static int E_LOOP = 11;
    public int ACTION_TYPE = 0;
    public int x = 0;
    public int y = 0;
    public int x1 = -1;
    public int y1 = -1;
    public int waitDelayA = 0;
    public int waitDelayB = -1;
    public int instructionInterval = 0;
    public int successiveInterval = 0;
    public int loopNumber = 0;
    public LinkedList<Action> loopInstructions = new LinkedList();
    public String modifier = "NONE";
    public String keys;
    
    

    @Override
    public String toString() {
        return Integer.toString(this.ACTION_TYPE);
    }    
}
