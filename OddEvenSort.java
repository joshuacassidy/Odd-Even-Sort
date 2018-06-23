public class OddEvenSort {

    public int[] sort(int[] arr) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 1; i < arr.length-1; i += 2) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    sorted = false;
                }
            }

            for(int i = 0; i < arr.length-1; i += 2) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    sorted = false;
                }
            }
        }

        return arr;
    }

    public void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public void traverse (int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

}
