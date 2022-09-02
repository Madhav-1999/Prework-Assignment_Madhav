class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
 }
    static void patternPrinter(int n) {
        int n = 5;
        
        
        int l = 0;
        
        
        while(l<n){
            for(int j=n;j>0;j--){
                for(int i=n-l;i>0;i--){
                    System.out.print(j);
                }
        
            }System.out.println();
            l++;
        }
     
 // write your code here
 
    
 
  
 }
}