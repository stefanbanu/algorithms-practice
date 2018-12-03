package bigonotationbasics;

/**
 * @author stefanbanu
 *
 */

public class BigONotationBasics {

	public static void main(String[] args) {
		
		constantComplexity(new int[]{5, 3, 7, 9}, 2);
		linearComplexity(new int[]{5, 3, 7, 9});
		quadraticComplexity(new int[]{5, 3, 7, 9}, new int[]{5, 3, 7, 9});
		
	}
	
	/**
	 * CONSTANT complexity or O(1)
	 * O(1) describes an algorithm that will always execute in the same time (or space),
	 * regardless of the size of the input data set.
	 * @param contacts
	 * @param index
	 * @return
	 */
	public static int constantComplexity(int[] contacts, int index){
		return contacts[index];
	}
	
	/**
	 * LINEAR complexity or O(n)   growth rate = single loop
	 * O(N) describes an algorithm whose performance will
	 * grow linearly and in direct proportion to the size of the input data set.
	 * @param elements
	 * @return
	 */
	public static int linearComplexity(int elements[]){
		int count = 0;
		for(int i = 0; i < elements.length; i++){
			if((elements[i]%2) == 0){
				count++;
			}
		}
		return count;
	}
	
	/**
	 * QUADRATIC complexity or O(N^2)   growth rate = loop inside of loop 
	 * O(N^2) represents an algorithm whose performance is directly proportional
	 * to the square of the size of the input data set. 
	 * This is common with algorithms that involve nested iterations over the data set. 
	 * Deeper nested iterations will result in O(N^3), O(N^4) etc.
	 * @param items1
	 * @param items2
	 * @return
	 */
	public static int quadraticComplexity(int[] items1, int[] items2){
		int count = 0;
		for (int i = 0; i < items1.length; i++) {
			for (int j = 0; j < items2.length; j++) {
				if(items1[i] == items2[j])
					count++;				
			}
		}
		return count;
	}
}
