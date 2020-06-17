
class Employee{
private String  name, address;
private int year,salary;
public Employee(String n,int y,int sal, String add){
name = n;
year = y;
salary =sal;
address=add;
}
public String getName( ){
return name;
}

public int getYear( )
{
return year;
}

public int getSalary( )
{
return salary;
}

public String  getAddress( )
{
return address;
}
};

class Emp{
public static void main(String [ ], args)
{ 
   Employee e1= new Employee("Robert ",1994,420361,"64C- WallsStreet");
   Employee e2= new Employee("Sam",2000,28000000,"68D- WallsStreet");
   Employee e1= new Employee("John",1999,2382583,"26B- WallsStreet");
System.out.printlin("Name\tyear of joining\tSalary\tAddress);
System.out.println(e1.getName( )+"\t"+e1.getYear( )+"\t"e1getSalary( )"\t"+e1.getAddress( ));

System.out.println(e2.getName( )+"\t"+e2.getYear( )+"\t"e2getSalary( )"\t"+e2.getAddress( ));

System.out.println(e3.getName( )+"\t"+e3.getYear( )+"\t"e3getSalary( )"\t"+e3.getAddress( ));
}
};
