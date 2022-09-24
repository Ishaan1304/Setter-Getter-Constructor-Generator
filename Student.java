import java.util.*;
import java.math.*;
class Student
{
private int rollNumber;
private String firstName;
private String lastName;
private char gender;
private float height;
private BigDecimal feePaid;
public Student()
{
this.rollNumber=0;
this.firstName="";
this.lastName="";
this.gender=' ';
this.height=0.0f;
this.feePaid=null;
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setFirstName(java.lang.String firstName)
{
this.firstName=firstName;
}
public java.lang.String getFirstName()
{
return this.firstName;
}
public void setLastName(java.lang.String lastName)
{
this.lastName=lastName;
}
public java.lang.String getLastName()
{
return this.lastName;
}
public void setGender(char gender)
{
this.gender=gender;
}
public char getGender()
{
return this.gender;
}
public void setHeight(float height)
{
this.height=height;
}
public float getHeight()
{
return this.height;
}
public void setFeePaid(java.math.BigDecimal feePaid)
{
this.feePaid=feePaid;
}
public java.math.BigDecimal getFeePaid()
{
return this.feePaid;
}

}