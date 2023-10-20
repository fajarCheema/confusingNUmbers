
import java.util.*;

class foo {
    public static void main(String[] args) {
        int[] array = {0,1,-1,-1,-1,-1,6,-1,8,9};
        int number = 1000;
        //int[] result = new int[];
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n=number;
        int d;
        for(int i=0; i<= number;i++){
            //base case
            if(i == 0 || i == 1 || i == 8){
                continue;
            }
            
            d=i/10;
            int r=i%10;
            int num = 10*d+r;
            if(array[r] != -1 && array[d%10]!=-1) {
                String str= Integer.toString(num);
                
                if(str.length() > 1 && str.chars().allMatch(c -> c == str.charAt(0))){
                    continue;
                }
                result.add(num);
                
            }
        }
        //System.out.println(result.toString());
        
       String message = "Total confusing numbers are:" + result.size();
       System.out.println(message);
    }
    
}
