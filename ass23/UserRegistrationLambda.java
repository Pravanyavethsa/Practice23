package ass23;

import java.util.regex.Pattern;

@FunctionalInterface
interface Fname{
    boolean fNameCheck(String s);
}
@FunctionalInterface
interface Lname{
    boolean lNameCheck(String s);
}
@FunctionalInterface
interface Email{
    boolean emailCheck(String s);
}
@FunctionalInterface
interface Mobile{
    boolean mobileCheck(String s);
}
public class UserRegistrationLambda {
    String fname;
    String lname;
    String email;
    String mobile;

    public  UserRegistrationLambda(String fname,String lname,String email,String mobile){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.mobile=mobile;
    }

    public static void main(String[] args) {
        UserRegistrationLambda u1=new UserRegistrationLambda("Vethsa","Pravanya","abc.xyz@gmail.com","91 7896543210");
        Fname fn=(String s)-> Pattern.matches("^[A-Z][A-Za-z]{3,}",s);
        Lname ln=(String s)->Pattern.matches("^[A-Z][A-Za-z]{3}",s);
        Email em=(String s)->Pattern.matches("^[a-z]{1,3}[.]{1}[a-z@$#.,]{1,}",s);
        Mobile mo=(String s)->Pattern.matches("91 [0-9]{10}",s);

        System.out.println("First name --" + u1.fname + "--Valid? "+fn.fNameCheck(u1.fname));
        System.out.println("Last name --" + u1.lname + "--Valid? "+ln.lNameCheck(u1.lname));
        System.out.println("Email --" + u1.email + "--Valid? "+em.emailCheck(u1.email));
        System.out.println("Mobile --" + u1.mobile + "--Valid? "+mo.mobileCheck(u1.mobile));

    }

}
