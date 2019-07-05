import DevPlanModel.DevelopmentPlan;
import DevPlanModel.Knowledge.Knowledge;
import DevPlanModel.Schedule.*;
import DevPlanModel.Student;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sasha", (new Knowledge(50, 80)), 0.8);
        Student student2 = new Student("Vasya", (new Knowledge(40, 60)), 0.5);
        Student student3 = new Student("Petya", (new Knowledge(60, 90)), 0.9);
        Student student4 = new Student("Vanya", (new Knowledge(30, 80)), 0.7);

        Schedule schedule1 = new Weekend();
        Schedule schedule2 = new Period((LocalDate.of(2015, 9, 1)), (LocalDate.of(2020, 6, 30)));
        Schedule schedule3 = new LastThursdayInMonths();
        Schedule schedule4 = new Negation();

        DevelopmentPlan devPlan1 = new DevelopmentPlan(student1);

        student1.addSchedule(schedule1);
        student2.addSchedule(schedule2);
        student3.addSchedule(schedule3);
        student4.addSchedule(schedule4);


//        System.out.println(student1.getKnowledge().practicalKnowledge);

    }
}