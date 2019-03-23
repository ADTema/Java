class Bitset{
    private int[] array1;//Массив
    private Integer size; //Размер

    Bitset(int a){
        size=a;
        array1 =new int[size];
    }
    //Добавление
    private void add(int a){
        Bitset array2 = new Bitset(this.array1.length + 1);
        System.arraycopy(this.array1, 0, array2.array1, 0, this.array1.length);
        array2.array1[this.array1.length+1]=a;
        this.array1= array2.array1;
    }
    //Пересечение
    public void intersection (Bitset array2){
        Bitset inter=new Bitset(0);
        for (int i2 : array1) {
            for (int i1 : array2.array1) {
                if (i2 == i1) {
                    inter.add(i1);
                }
            }
        }
    }
    //Принадлежность
    private boolean accessory(int a){
        boolean ans=false;
        for(int i:this.array1) {
            if(i==a) {
                ans=true;
                break;
            }
        }return ans;
    }
    //Дополнение
    public void addition (Bitset array2){
        for (int i2:array2.array1) {
            if(!this.accessory(i2)){
            this.add(i2);
            }
        }
    }

    //Объединение
    public void association (Bitset array2){
        for (int i2:array2.array1){
            this.add(i2);
        }
    }

    //Удаление
    private void remuve (int search){
        Bitset array3 = new Bitset(0);
        for (int j = 0; j < this.array1.length; j++) {
            for (int i = j; i < this.array1.length; i++) {
                if (this.array1[i] == search) {
                    for (int k = i; k < this.array1.length - 1; k++) {
                        this.array1[k] = this.array1[k + 1];
                        array3.array1 = new int[this.array1.length-1];
                        for(int g =0;g<array3.array1.length;g++){
                            array3.array1[i]=this.array1[i];
                        }
                    }
                }
            }
        }
        this.array1=array3.array1;
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
