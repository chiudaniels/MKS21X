import java.util.Arrays;
public class Sorts{
    public static void printArray(int[]data){
	System.out.println (Arrays.toString(data));
    }

    public static void printNum(int[]data){
	System.out.println(smallestNum(data));
    }
    
    public static void selectionSort(int[]data){
	int current=0;
	int y=0;
	int tempNum =0;
	int [] whatsLeft = Arrays.copyOf(data, data.length);
	while (current < data.length){
	    if (data[current] == smallestNum(whatsLeft)){
		current++;
		whatsLeft= Arrays.copyOfRange(data, current, data.length);
	    }
	    else {
		tempNum = data[current];
		data [indexOf(data, smallestNum(whatsLeft))] = tempNum;
		data[current] = smallestNum(whatsLeft);
		whatsLeft= Arrays.copyOfRange(data, current, data.length);
	    }
	    
	}
	// while (x<data.length){
	//     if (data[x]==data[smallestNum(data)]){
	// 	x++;
	//     }
	//     else{
	// 	int z=0;
	// 	y=data[x];
	// 	z= smallestNum(data);
	// 	data[x]=z;
	// 	data[z]=y;
	//     }
	// }
    }

    public static int smallestNum(int[]data){
	int current=0;
	int result=data[0];
	while (current<data.length){
	    if (result > data[current]){
	        result= data[current];
		current++;
	    }
	    else {
		current++;
	    }	
	}
	return result;
    }

    public static int indexOf(int[]data, int value){
	int result = -1;
	for (int x=0; x<data.length; x++){
	    if (data[x] == value){
		result = x;
	    }
	}
	return result;
    }
}

	
