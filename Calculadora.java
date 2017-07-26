//Version1
public class Calculadora {

    public static void main(String[] args) {
        
        int n = args.length;
        boolean aux=true;
                
        if(n==0)
        {
            System.out.println("No se ingresaron argumentos");
        }
        else
        {            
             if((args[n-1].equals("x"))||(args[n-1].equals("+"))||(args[n-1].equals("-"))||(args[n-1].equals("/")))
                    System.out.println("Expresion incorrecta");
             else
             {
                   
                for(int i=0; i< n;i++)
                           
                        if((args[i].equals("x"))||(args[i].equals("+"))||(args[i].equals("/"))||(args[i].equals("-")))
                                               
                            if(i != (args.length -1))
                                if(args[i].equals(args[i+1]))
                                aux = false;        
                if(aux==true)
                {
                    for(int i=0; i<n; i++)
                    {
                        if(args[i].equals("/"))
                        {
                            float aux1= Float.parseFloat(args[i-1])/Float.parseFloat(args[i+1]);
                            args[i-1]= String.valueOf(aux1);
                            
                            for(int j=i; j< n-2; j++)   
                                args[j]= args[j+2];
                            
                            n=n-2;
                            i--;                 
                        }   
                    }
                    
                    for(int i=0; i<n; i++)
                    {
                        if(args[i].equals("x"))
                        {
                            float aux1= Float.parseFloat(args[i-1])* Float.parseFloat(args[i+1]);
                            args[i-1]= String.valueOf(aux1);
                            
                            for(int j=i; j<n-2; j++)   
                                args[j]= args[j+2];
                            
                            n=n-2;
                            i--;                 
                        }   
                    }
                    
                     for(int i=0; i<n; i++)
                    {
                        if(args[i].equals("-"))
                        {
                            float aux1= Float.parseFloat(args[i-1]) - Float.parseFloat(args[i+1]);
                            args[i-1]= String.valueOf(aux1);
                            
                            for(int j=i; j<n-2; j++)   
                                args[j]= args[j+2];
                            
                            n=n-2;
                            i--;                 
                        }   
                    }
                    
                    for(int i=0; i<n; i++)
                    {
                        if(args[i].equals("+"))
                        {
                            float aux1= Float.parseFloat(args[i-1]) + Float.parseFloat(args[i+1]);
                            args[i-1]= String.valueOf(aux1);
                            
                            for(int j=i; j<n-2; j++)   
                                args[j]= args[j+2];
                            
                            n=n-2;
                            i--;                 
                        }   
                    }
                                      
                    System.out.println("El resultado es: "+ args[0]);
                }
                else
                 System.out.println("Expresion incorrecta");                      
            }    
        }
    }
}


    

