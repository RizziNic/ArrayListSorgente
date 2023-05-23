public class MyArrayList<T> {

    //public T tipo;
    int lunghezza;
    int a[] = new int[1];

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

    public void add(int index, int valore){
        for(int i = 0; i<a.length; i++){
            if(i == index){
                int b[] = new int[1];

            }
        }


    }


}
