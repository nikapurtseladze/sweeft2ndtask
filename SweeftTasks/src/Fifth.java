
public class Fifth {

	public int countVariants(int stairsCount){
        if(stairsCount<=3) return stairsCount;

        int[] arr = new int[stairsCount+1];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[stairsCount];
    }

}
