package Exception;

public class Test {
    public static void main(String[] args) {
        try{
            testMethod(19);
        }catch(InvalidAgeCustomException e)  {
            System.out.println(e.getMessage());

        }
        
    }

public static  void testMethod(int age) throws InvalidAgeCustomException{
    if(age<18){
       throw new InvalidAgeCustomException("Age is not valid");
    }
    else{
        System.out.println("badeee ho gye appp");
    }

}

}
