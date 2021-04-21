package eqilibriumChallenge;

public class EquilibriumArray {
	int equilibrium(int arr[], int n)
    {
        int i, j;
        int leftsum, rightsum;
 
        //We are going to keep checking for indexes one by one till we find the equilibrium index
        for (i = 0; i < n; ++i) {
 
            /* getting the left sum */
            leftsum = 0; 
            for (j = 0; j < i; j++)
                leftsum += arr[j];
 
            /* getting the right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
 
            //we're checking whether or not the right and left sum are same
            if (leftsum == rightsum)
                return i;
        }
 
        /* we're returning -1 in case we cannot find any equilibrium index*/
        return -1;
    }
	public static void main(String[] args) {

		
		EquilibriumArray obj = new EquilibriumArray();
        int arr[] = { 3, 5, 8, 9, 0, -1  };
        int arr_size = arr.length;
        System.out.println(obj.equilibrium(arr, arr_size));
	}

}
