import heap.BinaryHeap;
import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static List<Double> TopKFast(ArrayList<Double> inputList, int k) {
		
		
		BinaryHeap <Double> minH = new BinaryHeap<Double>();
		
		for (Double element : inputList) {
			if (minH.size() >= k) { //add to heap until size k
				minH.remove(); ////once u reach k, remove min element
			}
			
			//and then continuing adding if u r not done
			minH.add(element);
		}
		
/*		
		if (inputList.size() <= minH.size()) {
			for(int i = 0; i < minH.size(); i++) {
				minH.add(inputList.get(i));
			}
		}
			
		else {
			//minH.remove();
			for(int i = minH.size(); i < inputList.size(); i++) {
				//minH.remove();
				minH.add(inputList.get(i));
			}
		}
		*/
		
		//return sorted list of doubles (top k values)
		return minH.getA(); //minH.get(array) //edited code in BinaryHeap.java to be able to use this function
	}

	public static void main(String[] args) {
		ArrayList<Double> inputList = new ArrayList<Double>(); //assume that you add more values than 10 because that is the default initialized size of the heap
		
		inputList.add(-55.0);
		inputList.add(-45.0);
		inputList.add(0.0);
		inputList.add(1.0);
		inputList.add(4.0);
		inputList.add(6.0);
		inputList.add(10.0);
		inputList.add(55.6);
		inputList.add(55.61);
		inputList.add(60.0);
	
		
		System.out.println(TopKFast(inputList, 9)); //set k=9 to test if there are only the top 9 values printing out or 10
	}
}

