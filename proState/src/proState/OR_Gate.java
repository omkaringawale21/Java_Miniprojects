package proState;

public class OR_Gate {

	public static void main(String[] args) {
		
		// By using + Operator Product Method
//		int a[] = {1, 0, 1, 0, 1};
//		int b[] = {0, 1, 1, 0, 0};
//		int i, product;
//		
//		for(i=0; i < 5; i++){
////			if(a[i] + b[i] > 0){
////				product = 1;
////			}else{
////				product = 0;
////			}
//			product = a[i] + b[i];
//			
//			System.out.printf("\n %d OR %d = %d", a[i], b[i], product);
//		}
		
		// By using | Operator Product Method
		int a[] = {1, 0, 1, 0, 1};
		int b[] = {0, 1, 1, 0, 0};
		int i, or_ans;
		
		for(i=0; i < 5; i++){
//			if(a[i] + b[i] > 0){
//				product = 1;
//			}else{
//				product = 0;
//			}
			or_ans = a[i] | b[i];
			
			System.out.printf("\n %d OR %d = %d", a[i], b[i], or_ans);
		}

		
	}

}
