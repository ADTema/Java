public class Bitset {
    private int[] array1;
    private int[] array2;
    private int search;

    //Пересечение
    public Bitset intersection (int[] array1, int[] array2){

    }
    //Объединение
    public Bitset association (int[] array1, int[] array2){

    }
    //Дополнение
    public Bitset addition (int[] array1, int[] array2){

    }
    //Добавление
    public Bitset add (int[] array,int a ){

    }
    //Удаление
    public int[] remuve (int[] array1, int search,int[] array3){
        search = 3;
        for (int j = 0; j < array1.length; j++) { //поиск удаляемого элемента
            for (int i = j; i < array1.length; i++) {
                if (array1[i] == search) {
                    for (int k = i; k < array1.length - 1; k++) { //сдвиг последующих элементов
                        array1[k] = array1[k + 1];
                        array3 = new int[array1.length-1];
                        for(int g =0;g<array3.length;g++){
                            array3[i]=array1[i];
                        }
                    }
                }
            }
        }return array3;
    }
    //Принадлежность
    public boolean accessory(int[] array1, int a, int[] array2){
        boolean ans=false;
        for(int i:array1) {
            if(i==a) { //поиск элемента
                ans=true;
                break;
            }
        }
        return ans;
    }
}
