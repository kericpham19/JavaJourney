public class useEmployee
{
   public static void main(String []args)
    {
      Employee obj=new Employee();
        obj.set_value();
        System.out.println(obj.getName()+", at $"+obj.getWage()+" per hour for "+obj.getHours()+" hours, your weekly pay is $"+obj.weeklyPay());
    }
}