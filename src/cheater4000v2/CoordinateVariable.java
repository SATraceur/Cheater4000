package cheater4000v2;

public class CoordinateVariable {
    public int x = 0;
    public int y = 0;
    public String varName = "NONE";
    public String errorMessage = "NONE";
    
    @Override
    public String toString() {
        return "X: " + x + " Y: " + y + " Name: " + varName;
    }   
}
