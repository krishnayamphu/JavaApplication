package mainapp.exceptiontype;

public class VoterAge {
    public void checkAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("you can vote");
        }else{
            throw new ArithmeticException("You are under 18");
        }
    }

    public static void main(String[] args) {
        VoterAge voterAge=new VoterAge();
        try{
            voterAge.checkAge(4);
        }catch (ArithmeticException e){
            System.err.println(e);
        }
    }
}
