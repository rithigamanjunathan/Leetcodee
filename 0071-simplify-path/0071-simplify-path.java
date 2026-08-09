class Solution {
    public String simplifyPath(String path) 
    {
      Stack <String> stack = new Stack<>();
      String[] paths = path.split("/");
      for(String part : paths)
      {
        if(part.equals("")|| part.equals("."))
        {
            continue ;
        }
        if(part.equals(".."))
        {
            if(!stack.isEmpty())
        {
            stack.pop();
        }
        }

        else
        {
            stack.push(part);
        }}
        StringBuilder string1 = new StringBuilder();
        for(String folder : stack)
        {
            string1.append("/").append(folder);
        }

        if(string1.length() == 0)
        {
            return "/";
        }

   return string1.toString();

      }  
    }
