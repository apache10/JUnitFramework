class factRe {
    public static void main(String[] arg){
        int num= 5;
        int temp= fact(num);
        System.out.println(temp);
    }
    public static int fact(int num){
        if(num<1)
            return 1;
        return num*fact(num-1);
    }
}