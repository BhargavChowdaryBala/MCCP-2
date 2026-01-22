
public class MergeSort {
  public static void main(String[] args) {
    int arr[] = {7, 72, 77, 9, 8, 3, 2, 1};
    int n = arr.length;
    mergeSort(arr, 0, n - 1);
    for(int i : arr) System.out.print(i+" ");
  }
  public static void mergeSort(int arr[], int low, int high){
    if(low >= high) return;
    int mid = (low+high)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
  }
  public static void merge(int arr[], int low, int mid, int high){
    int temp[] = new int[arr.length];
    int left = low, right = mid+1;
    int idx = low;
    while(left<=mid && right<=high){
      if(arr[left]<=arr[right]){
        temp[idx++] = arr[left];
        left ++;
      }
      else{
        //System.out.println(arr[right]+" ");
        temp[idx++] = arr[right];
        right ++;
      }
    }
    //left out elements in left sub array
    while(left<=mid){
      //System.out.println(arr[left]+" ");
      temp[idx++] = arr[left];
      left ++;
    }
    //right sub array left out elements
    while(right<=high){
      //System.out.println(arr[right]+" ");
      temp[idx++] = arr[right];
      right ++;
    }
    for(int i = low;i<=high;i++)
      arr[i] = temp[i];
    //for(int i : arr) System.out.print(i+" ");
  }
}