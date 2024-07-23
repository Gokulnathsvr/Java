package JPQP_JusPay_Prob;

import java.util.Scanner;

public class LargestSumCycle {
        static long largestsum=-1;
        static int count=0;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N=sc.nextInt();
            int[] edges = new int[N];
            boolean[] pathvisit=new boolean[N];
            boolean[] nodevisit=new boolean[N];
            for(int i=0;i<N;i++){
                edges[i]=sc.nextInt();
            }
            for(int i=0;i<edges.length;i++){
                if(!nodevisit[i]){
                    DFS(i,edges,pathvisit,nodevisit);
                }
            }
            System.out.println(largestsum);
            System.out.println(count);
        }
        public static void DFS(int i, int[] edges, boolean[] pathvisit, boolean[] nodevisit){
            pathvisit[i]=true;
            nodevisit[i]=true;
            if(edges[i]!=-1){
                int adj=edges[i];
                if(!nodevisit[adj]){
                    DFS(adj,edges,pathvisit,nodevisit);
                }else if(pathvisit[adj]){
                    int curr = adj;
                    int sum=0;
                    int count1=0;
                    do{
                        sum = sum+curr;
                        curr = edges[curr];
                        count1++;
                    }while(curr!=adj);
                    if(sum>largestsum){
                        largestsum=sum;
                        count=count1;
                    }
                }
            }
            pathvisit[i]=false;
        }
    }

