package demo.CgJavaBook.InheritanceNDpolymorphsim.ex1;

public class Main {
    public static void main(String[] args) {
        //Person p1 = new Person("smith", 40);
        Account account=new Person("smith",50);
        account.setAccountNumber(55331115);
        account.setBalance(2000);
        Account account1=new Person("kathy",30);
        account1.setBalance(3000);
        account.deposit(2000);
        System.out.println(account.getBalance());
        account.withdraw(3400);
        System.out.println(account.getBalance());
        account.setAccountHolder((Person) account);
        System.out.println("Name is "+((Person) account).getName()+
        " Age is "+ ((Person) account).getAge()+
                "Account Number is "+account.getAccountNumber()+
        " balance is "+ account.getBalance());
        account.setAccountHolder((Person) account1);
        System.out.println("Name is "+((Person) account1).getName()+
                " Age is "+ ((Person) account1).getAge()+
                " balance is "+ account1.getBalance());




    }
}











































        //        Account account=new Account();
//        account.setBalance(500,p1);
//        account.getAccountHolder(p1);
//        account.getAccountHolder(p2);
//        account.setAccountNumber(990993);
//
//
//        System.out.println(account.getAccountNumber());

