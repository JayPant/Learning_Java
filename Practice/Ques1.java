package Practice;
public class Ques1 {
    public double calcFeetAndInches(double feet, double inches)
    {
        if(feet>=0 &&(inches>=0 &inches<=12))
        {
            // 1 feet = 30.48cm || 1 inchs = 2.54cm
            double  cm = feet*30.48 + inches*2.54;
            return cm;
        }
        else{
            return -1;
        }
    }

    public double calcFeetAndInches( double inches)
    {
        if(inches>=0 )
        {
            // 1 feet = 30.48cm || 1 inchs = 2.54cm
            double  res = inches*0.83333;
            return res;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Ques1 e1 = new Ques1();
        double result= e1.calcFeetAndInches(14, 10);
        System.out.println("In centimeter is: "+ result+ " cm");


    }

}
