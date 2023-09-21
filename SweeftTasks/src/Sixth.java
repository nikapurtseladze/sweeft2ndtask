
public class Sixth {

	
		Object[] array;
	    int count = 0;

	    public Sixth(){
	        this.array = new Object[20];
	    }

	    public void add(Object obj){
	        if(count==array.length){
	            Object[] arrayClone = array.clone();
	            array = new Object[array.length*2];

	            for(int i=0; i<arrayClone.length; i++){
	                array[i] = arrayClone[i];
	            }
	        }

	        array[count] = obj;
	        count++;
	    }

	    public boolean delete(){
	        if(count==0){
	            return false;
	        }else{
	            array[count] = null;
	            count--;
	            return true;
	        }
	    }

	}


