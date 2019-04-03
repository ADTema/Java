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
    public void remuve(int number){//Меняет бит под определенным номером с 1 на 0
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
/*
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



    void printSet(){
        System.out.println();
    }
*/}
