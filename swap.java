class swap
{  
    public static void main(String a[])   
    {   
        /*Define variables*/  
        int x = 8 ;
        int y = 9 ;
        System.out.println("before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  