
class limes{
	public String notString(String str) {
		  String not = "not";
		  if (str.length()<3){
		     return not + " " + str;
		  }else if (str.equals(not)){
		      return str;   
		  }else if (str.substring(0,3).equals(not)){
		     return str; 
		}else{
		    return not + " " + str;
		    }
		    }

	
	}
