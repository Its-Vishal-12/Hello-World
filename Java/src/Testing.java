
public class Testing {
	public static void main(String[] args) {
		
		String name="my name is kumar ";

	String[] arr=name.split(" ");
	
	
	int count=0;
	boolean  repeat=false;
	
	for(int i=0; i<=arr.length-1; i++) {
		
		for(int y=i+1; y<=arr.length-1; y++) {
			
			//System.out.println(arr[y]+   "     "    +arr[i]);
			
			
			String same=arr[i];
			String same2=arr[y];
			if(same.equals(same2)) {
				
			
				repeat=true;
				count ++;
			}else {
				
				
			}
			
		}
				
	}
		System.out.println(repeat);
		System.out.println("no. of repeates:"+count);
	}
	


	
	
	
	
	

}
