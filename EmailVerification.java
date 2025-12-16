public class EmailVerification{
     String firstName,lastName,email;
        int age;
        
        public EmailVerification(String firstName,String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
        public EmailVerification(int age){
            this.age = age;
        }

        public void otpVerification(){
            System.out.println("Enter Your OTP");
        }
        public void resendOtp(){
            System.out.println("You otp sent in your mail");
        }
    public static void main(String[] args) {
        EmailVerification name = new EmailVerification("jaya","preetha","jayaraman4preetha@gmail.com");
        EmailVerification age = new EmailVerification(23);

        System.out.println("Name:" + name.firstName + name.lastName + name.email);
        System.out.println("age:" + age.age);

       
    }
}

