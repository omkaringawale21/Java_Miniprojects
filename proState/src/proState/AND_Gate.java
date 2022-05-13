package proState;

public class AND_Gate {

	public static void main(String[] args) {
		
		// By using * Operator Product Method
//		int a[] = {1, 0, 1, 0, 1};
//		int b[] = {0, 1, 1, 0, 0};
//		int i, product;
//		
//		for(i=0; i < 5; i++){
//			product = a[i] * b[i];
//			
//			System.out.printf("\n AND GATE : %d AND %d = %d", a[i], b[i], product);
//
//		}
		
		// By using & Operator
//		int a[] = {1, 0, 1, 0, 1};
//		int b[] = {0, 1, 1, 0, 0};
//		int i, and_ans;
//		
//		for(i=0; i < 5; i++){
//			and_ans = a[i] & b[i];
//			
//			System.out.printf("\n AND GATE : %d AND %d = %d", a[i], b[i], and_ans);
//
//		}
		
		// By using IF-ELSE statement
		int a[] = {1, 0, 1, 0, 1};
		int b[] = {0, 1, 1, 0, 0};
		int i, ans;
		
		for(i = 0; i < 5; i++){
			if(a[i]==0 && b[i]==0){
				ans = 0;
			}else if(a[i]==1 && b[i]==0){
				ans = 0;
			}else if(a[i]==0 && b[i]==1){
				ans = 0;
			}else{
				ans = 1;
			}
			
			System.out.printf("\n AND GATE : %d AND %d = %d", a[i], b[i], ans);
			
		}		
		
	}

}
