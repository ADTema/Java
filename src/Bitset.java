class Bitset{
    int[] array;//Массив
    private int size;
    Bitset(int size){
        if(size%Integer.SIZE==0) this.array=new int[size/Integer.SIZE];
        else this.array=new int[(size/Integer.SIZE)+1];
        for (int i=0;i<(size/Integer.SIZE)-1;i++) this.array[i]=0;
        this.size=size;
    }

    //Удаление
    public void remove(int number){//Меняет бит под определенным номером с 1 на 0
        if(number>this.size) throw new ArrayIndexOutOfBoundsException();

        int num=number%Integer.SIZE;
        int r=Integer.MAX_VALUE-1;
        if (number%Integer.SIZE==0){
            number=(number/Integer.SIZE)-1;
        }else {
            number = number / Integer.SIZE;
            for(int i=0;i<Integer.SIZE-num;i++){
                r=r<<(1);
                r|=1;
            }
        }
        this.array[number]&=r;
    }

    //Добавление
    public void add(int number){//Меняет бит под определенным номером с 0 на 1
        if(number>this.size)throw new ArrayIndexOutOfBoundsException();
        int num=number%Integer.SIZE;
        int r=1;
        if (number%Integer.SIZE==0){
            number=(number/Integer.SIZE)-1;
        }else {
        number = number/(Integer.SIZE+1);
        r=r<<(Integer.SIZE-num);
        }
        this.array[number]|=r;
    }

    //Пересечение
    public Bitset intersect (Bitset array2){
        Bitset inter;
        if(this.size>array2.size){
            inter=new Bitset(array2.size);
        }else {
            inter=new Bitset(this.size);
        }
        for (int i=0;i<inter.array.length;i++){
            inter.array[i]=this.array[i]&array2.array[i];
        }
        return inter;
    }

    //Принадлежность
    public boolean contain (int number){
        boolean ans=false;
        int by=this.array[number/(Integer.SIZE+1)];
        by=by>>(Integer.SIZE-(number%Integer.SIZE));
        if (by%2==1) ans=true;
        return ans;
    }

    //Объединение
    public Bitset unite (Bitset array2){
        Bitset inte;
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
        }
        return inte;
    }

    //Дополнение
    public Bitset comp (){
        Bitset array2 = new Bitset(this.size);
        for(int i=0;i<this.size/Integer.SIZE;i++){
            array2.array[i]=~this.array[i];
        }
        return array2;
    }
}
