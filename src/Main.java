//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Second project start!");

        System.out.println("Task 1");
        var dogAmount = 8.0;
        var catAmount = 3.6;
        var paperAmount = 763789;
        System.out.println(dogAmount);
        System.out.println(catAmount);
        System.out.println(paperAmount);
        System.out.println(" ");

        System.out.println("Task 2");
        dogAmount = dogAmount + 4;
        catAmount = catAmount + 4;
        paperAmount = paperAmount + 4;
        System.out.println(dogAmount);
        System.out.println(catAmount);
        System.out.println(paperAmount);
        System.out.println(" ");

        System.out.println("Task 3");
        dogAmount = dogAmount - 3.5;
        catAmount = catAmount - 1.6;
        paperAmount = paperAmount - 7639;
        System.out.println(dogAmount);
        System.out.println(catAmount);
        System.out.println(paperAmount);
        System.out.println(" ");

        System.out.println("Task 4");
        var friendAmount = 19;
        System.out.println(friendAmount);
        friendAmount = friendAmount + 2;
        System.out.println(friendAmount);
        friendAmount = friendAmount / 7;
        System.out.println(friendAmount);
        System.out.println(" ");

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight);
        System.out.println(secondBoxerWeight);
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var differenceWeight =  secondBoxerWeight - firstBoxerWeight;
        System.out.println(totalWeight);
        System.out.println(differenceWeight);
        System.out.println(" ");

        System.out.println("Task 7");
        var divisionRemainder =  secondBoxerWeight % firstBoxerWeight;
        System.out.println(divisionRemainder);
        System.out.println(" ");

        System.out.println("Task 8");
        var totalWorkHours =  640;
        var hoursAmountForEmployee = 8;
        var employeeAmount = totalWorkHours / hoursAmountForEmployee;
        System.out.printf("Всего поделено между сотрудниками %d часов работы %n",totalWorkHours);
        System.out.printf("Каждый сотрудник посвящает работе %d часов %n",hoursAmountForEmployee);
        System.out.printf("Всего работников в компаниии %d человек %n",employeeAmount);
        var additionEmployees = 94;
        System.out.printf("Дополнительное кол-во сотрудников = %d %n", additionEmployees);
        var newEmployeeAmount = (employeeAmount + additionEmployees);
        var newTotalWorkHours = newEmployeeAmount * hoursAmountForEmployee;
        System.out.printf("Если в компании работает %d человек, то всего %d часов работы может быть поделено между сотрудниками", newEmployeeAmount, newTotalWorkHours);
        System.out.println(" ");
    }
}