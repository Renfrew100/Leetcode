public int andSol(int[] arr){
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i = 0; i<arr.length; i++){
		max = Math.max(max,arr[i]);
		min = Math.min(min,arr[i]);
	}
	int []freq = new int[max + 1];
	// Count the frequency
	for(int i = 0; i < arr.length; ++i)
		freq[arr[i]]++;

	int result = 0;

	// Every possible sum of pairs
	for(int sum = 2*min; sum <= 2 * max; sum++){
		// Count of pairs with given sum
		int pair = 0;
		for(int num = 1; num < (sum + 1) / 2; num++){
			// Check for a possible pair
			if (sum - num <= max){
				// Update count of pair
				pair += Math.min(freq[num], freq[sum - num]);
			}
		}
		if (sum % 2 == 0){
			pair += freq[sum / 2] / 2;
		}
		// Update the result
		result = Math.max(result, pair);
	}

	return result;
}