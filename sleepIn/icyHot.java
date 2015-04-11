public boolean icyHot(int temp1, int temp2) {
  if (temp1<0){
      if (temp2>100){
      return true;
      }else{
      return false;
      }
  }else if (temp1>100){
      if (temp2<0){
      return true;
      }else{
      return false;
      }
  }else if (temp1==0){
  return false;
  }else if (temp2==0){
  return false;
  }else{
  return false;
  }
}
