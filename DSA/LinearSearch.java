public class LinearSearch {

    public static void main(String[] args) {
        int[] nums= {20,30,10,56,1,2};
        int target= 56;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //if the target item is not found then return -1
    static int linearSearch(int[] arr,int target){    
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            int element = arr[i];
            if(element == target)
            return i; 
        }
        return -1; //this is for when none of the statements get executed.
    }
}
in boolean it becomes true or false.  