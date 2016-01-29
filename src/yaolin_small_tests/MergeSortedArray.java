package yaolin_small_tests;

public class MergeSortedArray {

	public void merge(int A[], int m, int B[], int n) {
		int p = m - 1;
        int q = n - 1;
        int temp = m + n - 1;
    
        while (p >= 0 && q >= 0){
            if (A[p] >= B[q]){
                A[temp] = A[p];
                p--;
            }
            else{
                A[temp] = B[q];
                q--;
            }
            temp--;
        }
    
        while(p >= 0){
            A[temp] = A[p];
            p--;
            temp--;
        }
    
        while(q >= 0){
            A[temp] = B[q];
            q--;
            temp--;
        }
    }
	
	public static void main(String[] args) {
		
	}
}
