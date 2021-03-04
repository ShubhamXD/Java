class arguments{
    public static void main(String []args){
        int length=args.length;
        System.out.println("Length:"+length);
        for(int i=0;i<length;i++){
            System.out.println("Arg "+i+": "+args[i]);
        }
    }
}
//WAP in java Program to accepts two numbers (int) as command line arguments and print their Sum
// Integer.parseInt(String_obj)
//String st="5";
//int a=Integer.parseInt(args[0]);