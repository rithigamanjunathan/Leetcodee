class Solution {
    public String toLowerCase(String s) 
    {
       StringBuilder sb = new StringBuilder();
      for(char str : s.toCharArray())  
      {
        if(str>='A' && str<='Z')
        {
           str =  Character.toLowerCase(str);
        }
        sb.append(str);
      }
      return sb.toString();
    }
}