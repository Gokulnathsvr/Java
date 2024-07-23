package JP;

import java.util.Scanner;

public class Nearest_MeetingCell {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int[] edges = new int[n];
            for(int i=0;i<n;i++){
                edges[i]=sc.nextInt();
            }
            boolean[] visited = new boolean[n];
            int node1=sc.nextInt();
            int node2=sc.nextInt();
            System.out.println(nearcell(edges,node1,node2,node1,node2,visited));
        }
        public static int nearcell(int[] edges, int n1,int n2, int node1,int node2,boolean[] visitedNode){
            if(visitedNode[node1] && node1 != n2)
                return node1;
            if(visitedNode[node2] && node2 != n1)
                return node2;
            if(node1==node2)
                return node1;

            visitedNode[node1]=true;
            visitedNode[node2]=true;
            return nearcell(edges,n1,n2,edges[node1],edges[node2],visitedNode);
        }
    }

