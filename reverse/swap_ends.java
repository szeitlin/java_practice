public String frontBack(String str) {
        String newstring="";
        int last = str.length()-1;
        
        if (str.length()==0){
        return "";
        
        } else if (str.length()==1){
        return str;
        
        } else if (str.length()==2){
        
        newstring += str.charAt(last);
        newstring += str.charAt(0);
        return newstring;
        
        } else 
        {newstring += str.charAt(last);
        for(int i=1;i<(last);i++){
            newstring+=str.charAt(i);
          }
        newstring += str.charAt(0);
        return newstring;
        }
}
