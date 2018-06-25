public class OddEvenSort {

    public int[] sort(int[] arr) {
        for (boolean sorted = false; !sorted; sortHelper(arr, 0), sorted = sortHelper(arr, 1));

        return arr;
    }

    public boolean sortHelper(int[] arr, int startIndex) {
        for(int i = startIndex; i < arr.length-1; i += 2) {
            if(arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
                return false;
            }
        }
        return true;
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
