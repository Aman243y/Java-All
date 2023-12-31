import java.util.HashMap;

public class mfoe {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 2, 2, 3, 3, 3};
        int mostFrequent = findMostFrequent(numbers);
        System.out.println("The most frequently occurring number is: " + mostFrequent);
		
}

	private static int findMostFrequent(int[] numbers) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mostFrequentNumber = 0;
        
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }
		return mostFrequentNumber;
		
		
	}
}
