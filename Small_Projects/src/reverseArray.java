
public class reverseArray {

	public static void main(String[] args) {
		int [] list = {1,2,3,4,5};
		reverse(list);
	}
	
	public static int[] reverse(int[] list) {
	int [] array = new int [list.length];
	
	for(int i = 0, j = array.length; i < list.length; i++, j--) {
		array[j] = list[i];
		
	}
	return list;
}

}
