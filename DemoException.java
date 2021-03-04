class DemoException{
    public static void main(String args[]){ 
        try{
        int a[]={10,20,30,40,50};
        System.out.println(a[4]/0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }    
    } 
}