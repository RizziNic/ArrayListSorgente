import java.util.Arrays;

public class MyArrayList<T> {

    //public T tipo;
    int lunghezza;
    int a[] = {1,2,3,4,5};

    public MyArrayList(){

    }

    public int get(int index){
        int posizione = 0;
        for(int i = 0; i< a.length; i++){
            if(i == index){
                posizione = a[i];
                System.out.print(a[i]);
            }
        }
        return posizione;
    }

    public String toString(int a[]){
        return " ";
    }

    /*
    public void add(int index, int valore){
        checkBoundInclusive(index);
        modCount++;
        if (size == data.length)
            ensureCapacity(size + 1);
        if (index != size)
            System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = e;
        size++;
    }

     */

    public void add(int index, int valore){
        int b[] = {valore};
        int c[] = new int[a.length + b.length];
        for(int i = 0; i<a.length; i++){
            if(i == index){
                //b[] = new int[1];
                b[0]+= a[i];
                for(int j=0; j<a.length + b.length; j++){
                    //int c[] = new int[a.length + b.length];
                    c[i] += a[i];
                    if(j == index){
                        c[i] += b[0];
                    } else if (j>index) {
                        c[i] += a[i];
                    }
                }

            }
        }

        System.out.print(Arrays.toString(c));


    }


}
