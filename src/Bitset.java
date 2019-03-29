
class Bitset{
    int[] array;//Массив
    private int size;
    Bitset(int size){
        if(size%32==0){
            array=new int[size/32];
            for (int i=0;i<array.length;i++) {
                array[i]= Integer.parseInt("0", 2);
            }
        }else {
            array=new int[(size/32)+1];
            for (int i=0;i<array.length;i++) {
                array[i]=Integer.parseInt("1111111111111111111111111111111", 2);
            }
            StringBuilder str= new StringBuilder();
            for(int j=0;j<size%32;j++){
                str.append(1);
            }
            String st = String.valueOf(str);
            array[array.length-1]= Integer.parseInt(st, 2);
        }
        this.size=size;
    }
    /*//Удаление
    public void remuve(int number){
        if (number%32==0){
            number=(number/32)-1;
            int bi=1;
        }else {
            int bi=number;
            number = (int)Math.floor(number/32);
        }
        this.array[number]=this.array[number]|(0<<(32-(number%32)));

    }*/
    //Добавление
    public void add(int number){//Меняет бит под определенным номером с 0 на 1
        int num=number%32;
        int r=0;
        if (number%32==0){
            r=32>>(1);
            number=(number/32)-1;
        }else {
            number = (int)Math.floor(number >> 5);
            r=33-num>>(1);
        }
        this.array[number]|=r;
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
