class Solution {
    public boolean isValid(String s) {
        if(s.length()==0 ||s.length()==1) return false;
        char[] op =new char[3];
        char[] cl =new char[3];
        op[0]='{';
        op[1]='[';
        op[2]='(';
        cl[0]='}';
        cl[1]=']';
        cl[2]=')';
        int size=s.length();
        char[] stack=new char[size];
        int pointer=0;
        for(int i=0;i<size;i++){
            for (char o:op){
                if(s.charAt(i)==o){
                    stack[pointer]=o;
                    pointer++;
                    break;
                }
            }
            if(pointer>0){
                for (int j=0;j<cl.length;j++){
                if(s.charAt(i)==cl[j]){
                    if(stack[pointer-1]==op[j]){
                        pointer--;
                        break;
                    }else{
                        return false;
                    }

                }}
            }else return false;

        }
        if (pointer==0) return true;
        return false;
    }
}