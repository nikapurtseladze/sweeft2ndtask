
public class Second {

	public int minSplit(int amount){
        if(amount<1) return 0;

        int count = 0;

        while(amount!=0){
            if(amount-50>=0){
                amount-=50;
            }else if(amount-20>=0){
                amount-=20;
            }else if(amount-10>=0){
                amount-=10;
            }else if(amount-5>=0){
                amount-=5;
            }else{
                amount-=1;
            }

            count++;
        }

        return count;
    }

}
