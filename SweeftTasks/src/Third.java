import java.util.*;

public class Third {

	
		
		public int notContains(int[] array){
	        if(array.length==0) return 1;

	        Set<Integer> set = new HashSet<Integer>();
	        int num = 1;

	        for(int i: array){
	            set.add(i);
	        }

	        while(set.contains(num)){
	            num++;
	        }

	        return num;
	    }

	}


