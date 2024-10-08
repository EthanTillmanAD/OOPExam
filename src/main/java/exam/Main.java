package exam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cloth clothingItem1 = new Cloth("Jeans", 20.00, Size.S);
        Cloth clothingItem2 = new Cloth("T-Shirt", 8.00, Size.M);
        Cloth clothingItem3 = new Cloth("Hat", 2.00, Size.L);


        Cloth[] shoppingBag = {clothingItem1, clothingItem2, clothingItem3};


        System.out.println(UtilityMethods.calculateSubTotal(shoppingBag));//prints 30.00

        Student student1 = new Student("Mike" , Size.L, shoppingBag);
        Student student2 = new Student("Jane", Size.S, shoppingBag);

        Student[] listOfStudents = {student1,student2};

      Student.printStudentsCount();//prints 2

        HourlyEmployee employee1 = new HourlyEmployee("Alex", -40.0f, 20.0, Size.S, shoppingBag);
        System.out.println( employee1.getHoursWorked());

        Manager manager1 = new Manager("Terry", 100000.0, Size.L,shoppingBag);
        manager1.printInfo();

        employee1.printPriceAfterDiscount();

        System.out.println( UtilityMethods.checkFitting(student1, clothingItem2));


        Buisness buisness1 = new Buisness("Acme", 10000, 20.0);
        buisness1.setEarnings(100001);

        System.out.println(buisness1.payTaxOnEarnings());// true


        IPayable [] payables = {buisness1, manager1, employee1 };

        UtilityMethods.printClassNamesOfPayableEntities(payables);


       Customer customerToManager = new HourlyEmployee("Rick", Size.S, shoppingBag);

        UtilityMethods.checkCustomerDiscount(customerToManager);


        System.out.println(((HourlyEmployee) customerToManager).canGetFired());

    }


}
