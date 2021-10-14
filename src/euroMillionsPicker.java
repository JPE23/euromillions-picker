import java.util.*;

public class euroMillionsPicker
{
	private static List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25,27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49);
	private static List<Integer> even = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50);
	private static int[] luckyStars = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static int [] low = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
	private static int [] high = {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

	public static void main(String[] args) {
		randomOddNumbers(odd);
		randomEvenNumbers(even);
	}

	public static List<Integer> randomOddNumbers(List<Integer> odd){
		List<Integer> oddList = new ArrayList<Integer>();
		int choice = 0;
		for (int i = 0; i < 3; i++){
			int randomNumber = new Random().nextInt(odd.size());
			choice = odd.get(randomNumber);
			oddList.add(choice);
			//oddList.remove(randomNumber);
		}
		System.out.println(oddList);
		return oddList;
	}
	public static List<Integer> randomEvenNumbers(List<Integer> even){
		List<Integer> evenList = new ArrayList<Integer>();
		int choice = 0;
		for (int i = 0; i < 2; i++){
			int randomNumber = new Random().nextInt(even.size());
			choice = even.get(randomNumber);
			evenList.add(choice);
			//evenList.remove(randomNumber);
		}
		System.out.println(evenList);
		return evenList;
	}
}
