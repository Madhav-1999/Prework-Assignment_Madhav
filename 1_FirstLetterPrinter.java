class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
    
        String str = "";
        str = str+input.charAt(0);
        
        for(int i=0;i<input.length();i++){
            char ch  =  input.charAt(i);
            if(ch == ' '){
                str = str+input.charAt(i+1);
            }
                      
        
        
        }
        
       
 // write your code here
       System.out.println(str);

    }
}