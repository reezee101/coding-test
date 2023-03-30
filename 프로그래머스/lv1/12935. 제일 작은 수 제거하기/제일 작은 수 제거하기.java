import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        if(arr.length <= 1) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;	
        }else {
        	
        	for (int i = 0; i < arr.length; i++) {
        		list.add(arr[i]);
			}        	
        	Arrays.sort(arr);
        	
        	int i = arr[0];

        	for (int j = 0; j < list.size(); j++) {
				if(list.get(j) == i) {
					list.remove(list.get(j));
					break;
				}
			}
        	
        	answer = list.stream()
                    .mapToInt(b -> b)
                    .toArray();
            return answer;
        }
    }
}