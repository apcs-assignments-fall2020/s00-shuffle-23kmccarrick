import sun.tools.jar.resources.jar;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] bluh = {arr[0],arr[1],arr[2],arr[3],arr[4]};
        int[] blah = {arr[5],arr[6],arr[7],arr[8],arr[9]};
        int[] bluah = new int[10];
        int j = 0;
        int k = 0;
        for(int i = 0; i < bluah.length; i++){
            if(i%2==0){
                bluah[i]=bluh[j];
                j++;
            }else{
                bluah[i]=blah[k];
                k++;
            }
        }
        return bluah;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int j = 0;
        for(int i = 0; i <arr.length; i ++){
            int b = (int)(Math.random() * (arr.length - 1 + 1));
            j = arr[i];
            arr[i]=arr[b];
            arr[b]=j;
        }
        return arr;
    }


    public static void main(String[] args) {
        
        
    }
}
