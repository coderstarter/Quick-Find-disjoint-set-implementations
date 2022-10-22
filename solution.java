/*package whatever //do not write package name here */

import java.util.*;
class Unionfind
{
    private int root[];
    public Unionfind(int size)
    {
        root = new int[size];
        for(int i=0;i<size;i++)
        {
            root[i]=i;
        }
    }
    public int find(int x)
    {
        return root[x];
    }
    public void union(int x,int y)
    {
        int rootx = find(x);
        int rooty = find(y);
        if(rooty != rootx)
        {
            for(int i=0;i<root.length;i++)
            {
                if(root[i]==rooty)
                {
                    root[i] = rootx;
                }
            }
        }
    }
    public boolean connected(int x,int y)
    {
        return find(x)==find(y);
    }
}

class GFG 
{
	public static void main (String[] args)
	{
	    Unionfind uf = new Unionfind(10);
	    uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        
		System.out.println(uf.connected(1, 5));
		System.out.println(uf.connected(2, 8));
	}
}
