public class CountingDownNumber{
	public static void main(String[] args){
		
		for(int count = 0 + 1; count < 10; count++){
			count++;
			for(int j = 0; j < count; j--){
				j++;
		}
				System.out.println(count);
			}


	}
}