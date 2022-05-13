package proState;

public class NOT_Gate {

	public static void main(String[] args) {
		
		// NOT GATE by using if-else statement
		int a[] = {1, 0, 1, 0, 0};
		int i, not_ans;
		
		for(i=0; i < 5; i++){
			if(a[i] == 0){
				not_ans = 1;
			}else{
				not_ans = 0;
			}
			
			System.out.printf("\n %d NOT GATE %d", a[i], not_ans);
		}

	}

}
