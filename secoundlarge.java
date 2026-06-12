public class secoundlarge {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int secoundlargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >max){
                secoundlargest = max;
                max = arr[i];
    }
    else if (arr[i]>secoundlargest && arr[i] != max){
        secoundlargest = arr[i];
    }
}

return secoundlargest;
}
}
