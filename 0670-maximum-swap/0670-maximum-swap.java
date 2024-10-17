class Solution {
    public int maximumSwap(int num) {
        int[] arr = getDigitsArray(num);
        for(int i=0;i<arr.length;i++){
            int max=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=max){
                    max=arr[j];
                    index=j;
                }
            }
            if(index!=i && max!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                return(convertToNumber(arr));

            }}
            return num;
        }

        public int convertToNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }

    public int[] getDigitsArray(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

        
    
}