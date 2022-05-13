package proState;

public class NOR_Gate {

	public static void main(String[] args) {
		
		// NOR GATE
		int a[] = {1, 0, 1, 0, 1};
		int b[] = {0, 1, 1, 0, 0};
		int i, nor_ans = 0;
		
		for(i=0; i < 5; i++){
			if(a[i]==0 && b[i]==0){
				nor_ans = 1;
			}else if(a[i]==1 && b[i]==1){
				nor_ans = 1;
			}
			else{
				nor_ans = 0;
			}
			
			
			System.out.printf("\n %d NAND GATE %d = %d", a[i], b[i], nor_ans);
		}

	}

}
