package graph;
import java.util.*;
public class graphDFS {
    
       public  int v;
        private List<List<Integer>>l=new ArrayList<>();
        graphDFS(int v)
        {
            this.v=v;
            for(int i=0;i<v;i++)
            l.add(new ArrayList<>());
        }
    
        public void add(int s,int d)
        {
            l.get(s).add(d);
        }
        public void display()
        {
            for(int i=0;i<v;i++)
            {
                for(int j=0;j<l.get(i).size();j++)
                System.out.print(l.get(i).get(j)+" ");
                System.out.println();
            }
        }
        public void Dfs(int val){
            boolean b[]=new boolean[v];
            dfs(val,b);
            for(int i=0;i<v;i++)
            {
                if(!b[i])
                {
                System.out.println("No");
                return;
                }
            }
            System.out.println("Yes");

        }
        public void dfs(int val,boolean b[])
        {
            b[val]=true;
            System.out.print(val+" ");
            for(int i=0;i<l.get(val).size();i++)
            {
                if(!b[l.get(val).get(i)])
                dfs(l.get(val).get(i),b);
            }

        }
    
    public static void main(String[] args) {
        graphDFS g=new graphDFS(5);
        g.add(0,4);
        // g.add(0,2);
        // g.add(3,5);
        // g.add(5,4);
        // g.add(4,3);
        // g.add(3,3);
        g.Dfs(0);
        // System.out.println();            
        g.display();
        
    }
    
}
