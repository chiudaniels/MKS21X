public class driver{
    public static void main(String[]args){
	int[] arrayName = { 0, 6, 7, 5, 3, 8, 9};
	//System.out.println(Sorts.smallestNum(arrayName));
	Sorts.printArray( arrayName);
	//Sorts.printNum( arrayName);
	Sorts.bubbleSort( arrayName);
	Sorts.printArray( arrayName);
    }
}
