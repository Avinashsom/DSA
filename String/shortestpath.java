package String;
import java.util.*;

public class shortestpath {
    public static float getShortestPath(String dir){
        int x=0; int y=0;
        for(int i=0; i<dir.length(); i++){
            char dis = dir.charAt(i);
            if(dis == 'N') y++;
            if(dis == 'S') y--;
            if(dis == 'E') x++;
            if(dis == 'W') x--;

        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String args[]){
        String direction ="NSNSNSNS";
        float shortestPath= getShortestPath(direction);
        System.out.println(shortestPath);
    }
}
