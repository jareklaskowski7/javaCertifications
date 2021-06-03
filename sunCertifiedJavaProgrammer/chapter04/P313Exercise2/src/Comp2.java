//	SCJPP313Exercise2
//	Chapter 4: Operators

class Comp2
{
    public static void main(String[] args)
    {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.6f, 2.7f};
        Long x = 42L;
        //  insert code here
        //  if(f1 == f2)            //  F1  not compile
        //  if(f1 == f2[2][1])      //  F2  compile
        // if(x == f2[0][0])       //  F3  compile "true"
        //  if(f1 == f2[1,1])       //  F4  not compile
          if(f3 == f2[2])         //  F5  compile
        System.out.println("true");
    }
}