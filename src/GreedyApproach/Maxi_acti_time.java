package GreedyApproach;

public class Maxi_acti_time {
    public static void main(String[] args){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int count=1;
        int len=0,Sidx=1,Eidx=0;
        while(len!=start.length-1){
            int Tstart=start[Sidx];
            int Tend=end[Eidx];
            if(Tstart>Tend){
                len++;
                count++;
                Sidx++;
                Eidx++;
            }else{
                len++;
                Sidx++;
            }
        }
        System.out.println(count);
    }
}
