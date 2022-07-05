public class TestClass {
    public static int[] createNewArray(int[]array, int k){
        int size=0;
        for(int i =0;i<array.length;i++){
            if(array[i]%10==k)size++;
        }
        int[]newarray=new int[size];
        System.out.println(size);
        int lastindex=0;
        for(int i =0;i<newarray.length;i++){
            for(int j =lastindex;i<array.length;j++){
                if(array[j]%10==k){
                    lastindex=j+1;
                    newarray[i]=array[j];
                    break;
                }
            }
        }
        return newarray;
    }

    public static void showArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[]array=new int[]{1,2,3,12,5,6,22,8,32,42,52,18,28};
        int[] newarray= TestClass.createNewArray(array,8);
        System.out.println("Первый массив: ");
        TestClass.showArray(array);
        System.out.println("\nВторой массив: ");
        TestClass.showArray(newarray);
    }
}
