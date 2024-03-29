package graph;


import java.util.*;

public class graphBFS {
    int v;
   LinkedList<Integer>l[]; 
    @SuppressWarnings("unchecked")
    graphBFS(int v)
    {
        this.v=v;
        l=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            l[i]=new LinkedList<>();

        }
    }
    public void add(int s,int d)
    {
        l[s].add(d);
    }
    public void display(){
        for(int i=0;i<l.length;i++)
        {
            for(int j=0;j<l[i].size();j++)
            {
                System.out.print(l[i].get(j)+" ");
                System.out.println();
            }
        }
    }
    public void bfs(int p)
    {
        boolean b[]=new boolean[v];
        b[p]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(p);
        while(!q.isEmpty()){
             p=q.poll();
            System.out.print(p+" ");
            for(int i=0;i<l[p].size();i++)
            {
                if(!b[l[p].get(i)])
                {
                    b[l[p].get(i)]=true;
                    q.add(l[p].get(i));
                }


            }
        }
    }
    public static void main(String[] args) {
        graphBFS g=new graphBFS(5);
        g.add(0,1);
        g.add(0,2);
        g.add(1,2);
        g.add(2,0);
        g.add(2,3);
        g.add(3,3);
        g.bfs(2);
        System.out.println();
        g.display();
    }
    
}
