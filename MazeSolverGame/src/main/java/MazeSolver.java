import javax.swing.*;

import java.awt.*;

//import java.util.ArrayList;
import java.util.*;;

         public class MazeSolver extends JFrame {
               private int[][]maze=new int[][]{
                        {1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,1,1,1,1,1,1,1,1,1},
                        {1,1,0,1,1,1,1,1,1,1,1,1},
                        {1,1,0,0,0,0,0,0,1,1,1,1},
                        {1,1,0,1,1,1,0,1,1,0,1,1},
                        {1,1,0,1,1,1,0,1,1,0,1,1},
                        {1,1,0,1,1,1,0,0,0,0,1,1},
                        {1,0,0,1,1,1,1,1,1,9,1,1},
                        {1,1,1,1,1,1,1,1,1,0,1,1},
                        {1,0,0,0,0,0,0,0,0,0,1,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1}};


               public ArrayList<Integer>Path=new ArrayList<Integer>();

               public MazeSolver(){
                   setTitle("MAZE  -  SOLVER ");
                   setSize(1000,1000);
                   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                   FindPathByDFS.FindingPath(maze, 1,1,Path);
//                   System.out.print(Path);

               }


               @Override
                public void paint(Graphics g){
                   g.translate(500,100);
                   for(int i=0;i<maze.length;i++){
                       for(int j=0;j<maze[0].length;j++){
                           Color boxColor;
                           switch(maze[i][j]){
                               case 1:boxColor=Color.GRAY;break;
                               case 9:boxColor=Color.RED;break;
                               default:boxColor=Color.WHITE;break;
                           }

                           g.setColor(boxColor);
                           g.fillRect(40*j,40*i,40,40);
                           g.setColor(Color.PINK);
                           g.drawRect(40*j,40*i,40,40);

                       }
                   }

                   for(int i=0;i<Path.size();i=i+2){
                       int a=Path.get(i);
                       int b=Path.get(i+1);
//                       System.out.println(a+" "+b);
                       g.setColor(Color.YELLOW);
                       g.fillRect(40*b,40*a,40,40);

                   }

               }

//

               public static void main(String Args[]){
                   MazeSolver view=new MazeSolver();
                   view.setVisible(true);
               }


}
