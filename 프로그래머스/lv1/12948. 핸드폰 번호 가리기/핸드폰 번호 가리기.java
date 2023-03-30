class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] charArr = phone_number.toCharArray();
        
        for(int i = 0; i < charArr.length - 4; i++) {
        	answer += '*';
        }
        
        answer += phone_number.substring(phone_number.length()-4);
        
        return answer;
    }
}