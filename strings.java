public class strings{
    public static void main(String args[]){
        String str = "racecar";
        String path ="wneenesennn";
        String tocompress = "aaabbcccdd";
        System.out.println(isPalindrome(str));
        System.out.println(shortestPath(path));
        System.out.println(compression(tocompress));
        System.out.println(compress(tocompress));
       }

   public static boolean isPalindrome(String str){
    int n = str.length();
    for(int i=0;i<n;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;   
        }
    }
    return true;
   }

   public static String compression(String str){
    String newstr = "";
    for(int i=0;i<str.length();i++){
        Integer count =1;
        while(i<str.length()-1  && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }

        newstr += str.charAt(i);
        if(count>1){
            newstr += count.toString();
        }
    }

    return newstr;
   }
   // string compression using stringbuilder more optimized

   public static String compress(String str){
    StringBuilder newstr  = new StringBuilder("");
    for(int i=0;i< str.length();i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
        }

        newstr.append(str.charAt(i));
        if(count>1){
            newstr.append(count.toString());
        }
    }
    return newstr.toString();
   }
   public static float shortestPath(String path){
    int n = path.length();
    int x =0;
    int y=0;
    for(int i=0 ;i<n;i++){
        char drc = path.charAt(i);
        if(drc== 'w'){
            x--;
        }
        else if(drc == 'e'){
            x++;
        }
        else if (drc == 's'){
            y--;
        }
        else{
            y++;
        }
    }
        int x2=x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
   }
   
}