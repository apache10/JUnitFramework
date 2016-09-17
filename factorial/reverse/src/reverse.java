class Reverse {


    public Reverse() {

    }

    public String Reverse(String str){
        char[] sArray = str.toCharArray();
        String newrev = "";
        String temp ="";
        int j=0;
        for(int i=0;i<sArray.length;i++) {
            temp+=sArray[i];
            if(sArray[i] == ' '){
                newrev = temp + newrev;
                temp="";
            }
        }

        return newrev;
    }
}