package Recursion;

public class PrintTillN {

    public int printtilln(int i ,int n){
        if(i==n){
            return 0;
        }
        System.out.println(i);
        return printtilln(i+1,n);
    }

    public int printName(int i ,int n){
        if(i==n){
            return 0;
        }
        System.out.println("Basith");
        return printName(i+1,n);
    }

    public int SumNnos(int i ,int n,int sum){
        if(i>n){
            return sum;
        }
        return SumNnos(i+1,n,sum+i);
    }

    public static void main(String[] args) {
        PrintTillN printTillN = new PrintTillN();
        printTillN.printtilln(0,100);
        printTillN.printName(0,100);
        System.out.println(printTillN.SumNnos(0,5,0));
    }
}
