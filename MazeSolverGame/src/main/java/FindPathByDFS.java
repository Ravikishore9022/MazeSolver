import java.util.ArrayList;

public class FindPathByDFS {
    public static boolean FindingPath(int [][]maze, int x, int y, ArrayList<Integer> Path){
        // found the destination box
        if(maze[x][y]==9){
            Path.add(x);
            Path.add(y);
            return true;
        }

        // if box is 0, we found a path, and next find the next reaching point
        // check all adjacent boxes, to reach there,

        if(maze[x][y]==0){
            // mark this box visited, not to visit again, but to move forward, rather than in cycles
            maze[x][y]=7; // visited;

            // upside row
            int dx=-1;
            int dy=0;
            if(FindingPath(maze,x+dx,y+dy,Path)){
                Path.add(x);
                Path.add(y);
                return true;
            }

            // downside row
            dx=1;
            dy=0;
            if(FindingPath(maze,x+dx,y+dy,Path)){
                Path.add(x);
                Path.add(y);
                return true;
            }


            // left column
            dx=0;
            dy=-1;
            if(FindingPath(maze,x+dx,y+dy,Path)){
                Path.add(x);
                Path.add(y);
                return true;
            }


            // right column
            dx=0;
            dy=1;
            if(FindingPath(maze,x+dx,y+dy,Path)){
                Path.add(x);
                Path.add(y);
                return true;
            }

        }
         // if  it is one, means block, then return false;
        return false;
    }
}
