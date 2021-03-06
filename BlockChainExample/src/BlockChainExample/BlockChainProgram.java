package BlockChainExample;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram {

	public static void main(String[] args) {

		// Demonstrate a hash function
		String statement1 = "My world is perfect";
		int hashValue = statement1.hashCode();
		
		System.out.println("Statement : " + statement1 + " ,whose hash value = " + hashValue);
		
		// let's hash an array
		String [] list1 = {"alex", "becky", "cyril"};
		String [] list2 = {"alex", "becky", "cyril"};
		
		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
		
		System.out.println("Hash1 : " + hash1 + " Hash2 : " + hash2);
		
		// Demonstrate a series of blocks in a chain
		ArrayList<Block> blockChain = new ArrayList<Block>();
		
		String[] initialValues = {"Omkar has $700", "Swapnil has $700"};
		
		Block fristBlock = new Block(initialValues, 0);
		
		blockChain.add(fristBlock);
		
		System.out.println("Frist Block is : " + fristBlock.toString());
		System.out.println("The Block Chain is : " + blockChain.toString());
		
		// Block Two
        String[] omkarGivesItAway = {"Omkar gives Sidhesh $40", "Omkar gives Swapnil $100"};
		
		Block secondBlock = new Block(omkarGivesItAway, fristBlock.getBlockHash());
		
		blockChain.add(secondBlock);
		
		System.out.println("Second Block is : " + secondBlock.toString());
		System.out.println("The Block Chain is : " + blockChain.toString());
		
		// Block Third
		String[] sidheshGivesItAway = {"Sidhesh gives Omkar $20", "Sidhesh gives Swapnil $150"};
		
		Block thirdBlock = new Block(sidheshGivesItAway, secondBlock.getBlockHash());
		
		blockChain.add(thirdBlock);
		
		System.out.println("Third Block is : " + thirdBlock.toString());
		System.out.println("The Block Chain is : " + blockChain.toString());
		
	}

}
