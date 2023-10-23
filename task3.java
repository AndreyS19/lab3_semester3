

import java.util.Scanner;
import java.util.Stack;
public class task3
{
    public static void zad_3_var_10()
    {
        //Умножить два многочлена заданной степени, если коэффициенты многочленов хранятся в списках.
        List  polynom1=new ArrayList<Double>();
        List  polynom2=new ArrayList<Double>();
        Scanner p=new Scanner(System.in);
        System.out.print("Степень первого многочлена n= ");
        int pow=p.nextInt();
        System.out.print("\nF(x)= c0 ");
        for(int i=1;i<=pow;i++)
        {
            System.out.print("+c"+i+"*x^"+i);
        }
        System.out.println();
        for(int i=0; i<=pow; i++)
        {
            System.out.print("c"+i+"=");
            polynom1.add(p.nextDouble());
        }
        System.out.println();
        System.out.print("F(x)= "+polynom1.get(0));
        for(int i=1; i<=pow; i++){
            if((double)polynom1.get(i)!=0.0)
            {
                if((double)polynom1.get(i)<0)
                    System.out.print(polynom1.get(i) + "x^" + i);
                else
                    System.out.print("+" + polynom1.get(i) + "x^" + i);
            }
        }



        System.out.print("\nСтепень второго многочлена n= ");
        int pow2=p.nextInt();
        System.out.print("\nf(x)= c0 ");
        for(int i=1;i<=pow2;i++)
        {
            System.out.print("+c"+i+"*x^"+i);
        }
        System.out.println();
        for(int i=0; i<=pow2; i++)
        {
            System.out.print("c"+i+"=");
            polynom2.add(p.nextDouble());
        }
        System.out.println();
        System.out.print("f(x)= "+polynom2.get(0));
        for(int i=1; i<=pow2; i++){

            if((double)polynom2.get(i)!=0.0)
            {
                if((double)polynom2.get(i)<0)
                    System.out.print(polynom2.get(i) + "x^" + i);
                else
                    System.out.print("+" + polynom2.get(i) + "x^" + i);
            }

        }
        System.out.println();


        double val;
        HashMap<Integer, Double> pol3=new HashMap<Integer, Double>();
        for(int i=0; i<=pow+pow2; i++)
            pol3.put(i,0.0);
        for(int i=0; i<=pow; i++)
        {
            for(j=0;j<=pow2;j++)
            {
                val=(double)polynom1.get(i)*(double)polynom2.get(j);
                pol3.put((i+j),val+pol3.get(i+j));
            }

        }
        System.out.print("\nf(x)*F(x)=");
        System.out.print(pol3.get(0));
        for(int i=1; i< pol3.size(); i++)
        {
            if (pol3.get(i) != 0.0) {
                if (pol3.get(i) < 0)
                    System.out.print(pol3.get(i) + "x^" + i);
                else
                    System.out.print("+" + pol3.get(i) + "x^" + i);
            }
        }
    }



}
