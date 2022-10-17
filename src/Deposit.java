class User
{
    private double principal;
    private int time;
    private int age;
    private double rate;
    private String gender;
    static double base=6.5;
    public User(double principal,int t,String gender,int age)
    {
     this.principal=principal;
     this.time=t;
     this.gender=gender;
     this.age=age;
    }
    public double CalculateInterest()
    {
        if(this.age>60)
        {
            this.rate=base+1;
        }
        if(this.time<1)
        {
            this.rate=base;
        }
        else if(this.time>=1&&this.time<=3)
        {
            this.rate=base+0.5;

        } else if (this.time>3&&this.time<=5) {
            this.rate=base+0.75;
        } else if (this.time>5) {
            this.rate=base+1.0;
        }
        if(this.age<18 && this.gender=="Female")
        {
            this.rate=base+1.25;
        }
 double Si=this.principal*this.rate*this.time/100;
        return Si;
    }
    public void Conditions()
    {

    }
}

public class Deposit {
    public static void main(String[] args) {
  User user=new User(10000,3,"Female",23);

        System.out.println("The calculated rate of interest is: "+user.CalculateInterest());
    }
}
