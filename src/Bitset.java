class Bitset{
    private int[] array;//Массив
    private Integer size; //Размер

    Bitset(int a){
        size=a;
        array=new int[size];
        this.size=a;
    }
    //Добавление
    private void add(int a){
        Bitset array2 = new Bitset(this.array.length + 1);
        System.arraycopy(this.array, 0, array2.array, 0, this.array.length);
        array2.array[this.array.length+1]=a;
        this.array= array2.array;
    }
    //Пересечение
    public void intersection (Bitset array2){
        Bitset inter=new Bitset(0);
        for (int i2 : array) {
            for (int i1 : array2.array) {
                if (i2 == i1) {
                    inter.add(i1);
                }
            }
        }
    }
    //Принадлежность
    private boolean accessory(int a){
        boolean ans=false;
        for(int i:this.array) {
            if(i==a) {
                ans=true;
                break;
            }
        }return ans;
    }
    //Дополнение
    public void addition (Bitset array2){
        for (int i2:array2.array) {
            if(!this.accessory(i2)){
            this.add(i2);
            }
        }
    }

    //Объединение
    public void association (Bitset array2){
        for (int i2:array2.array){
            this.add(i2);
        }
    }

    //Удаление
    private void remuve (int search){
        Bitset array3 = new Bitset(0);
        for (int j = 0; j < this.array.length; j++) {
            for (int i = j; i < this.array.length; i++) {
                if (this.array[i] == search) {
                    for (int k = i; k < this.array.length - 1; k++) {
                        this.array[k] = this.array[k + 1];
                        array3.array = new int[this.array.length-1];
                        for(int g =0;g<array3.array.length;g++){
                            array3.array[i]=this.array[i];
                        }
                    }
                }
            }
        }
        this.array=array3.array;
    }
    void printSet() {
        System.out.println();
    }
}

class Main {
    public static void main(){
        Bitset qwe=new Bitset(0);
        qwe.printSet();
    }
}
