package proState;

public class NAND_Gate {

	public static void main(String[] args) {
		
		// NAND GATE by using if-else statement
		int a[] = {1, 0, 1, 0, 1};
		int b[] = {0, 1, 1, 0, 0};
		int i, nand_ans;
		
		for(i=0; i < 5; i++){
			if(a[i] == 1 && b[i] == 1){
				nand_ans = 0;
			}else{
				nand_ans = 1;
			}
			
			System.out.printf("\n %d NAND GATE %d = %d", a[i], b[i], nand_ans);
		}
		
	}

}
