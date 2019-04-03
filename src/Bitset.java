import java.util.Arrays;

class Bitset{
    int[] array;//Массив
    private int size;

    Bitset(int size){
        if(size%32==0) this.array=new int[size/32];
        else this.array=new int[(size/32)+1];
        for (int i=0;i<(size/32)-1;i++) this.array[i]=0;
        this.size=size;
    }

    //Удаление
    public void remove(int number){//Меняет бит под определенным номером с 1 на 0
        if(number<=this.size){
            int num=number%32;
            int r=Integer.MAX_VALUE-1;
            if (number%32==0){
                number=(number/32)-1;
            }else {
                number = (int)Math.floor(number >> 5);
                for(int i=0;i<32-num;i++){
                    r=r<<(1);
                    r|=1;
                }
            }
            this.array[number]&=r;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    //Добавление
    public void add(int number){//Меняет бит под определенным номером с 0 на 1
        if(number<=this.size){
            int num=number%32;
            int r=1;
            if (number%32==0){
                number=(number/32)-1;
            }else {
            number = (int)Math.floor(number >> 5);
            r=r<<(32-num);
            }
            this.array[number]|=r;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    //Пересечение
    public Bitset intersection (Bitset array2){
        Bitset inter=new Bitset(0);
        if(this.size>array2.size){
            inter=new Bitset(array2.size);
        }else {
            inter=new Bitset(this.size);
        }
        for (int i=0;i<inter.array.length-1;i++){
            inter.array[i]=this.array[i]&array2.array[i];
        }return inter;
    }

    //Принадлежность
    public boolean accessory(int number){
        boolean ans=false;
        int by=this.array[(int) Math.ceil(number/33)];
        for(int i=0;i<(number%32);i++){
            by/=2;
        }
        if (by%2==1) ans=true;
        System.out.println(ans);
        return ans;
    }
    //Объединение
    public Bitset association (Bitset array2){
        Bitset inte=new Bitset(0);
        int in = 0;
        if(this.size>array2.size){
            inte=new Bitset(array2.size+(this.size-array2.size));
            in = array2.array.length;
        }else {
            inte=new Bitset(this.size+(array2.size-this.size));
            in = this.array.length;
        }
        for (int i=0;i<inte.array.length;i++){
            if (i<in){
                inte.array[i]=this.array[i]|array2.array[i];
            } else {
                if(in==this.array.length){
                    inte.array[i]=array2.array[i];
                } else {
                    inte.array[i]=this.array[i];
                }
            }
        }System.out.println(Arrays.toString(inte.array));
        return inte;
    }
/*
    //Дополнение
    public void addition (Bitset array2){
        for (int i2:array2.array) {
            if(!this.accessory(i2)){
            this.add(i2);
            }
        }
    }





    void printSet(){
        System.out.println();
    }
*/}
