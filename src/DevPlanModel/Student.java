package DevPlanModel;

import DevPlanModel.Knowledge.Knowledge;
import DevPlanModel.Schedule.Schedule;

public class Student {

    private String name;
    private Knowledge knowledge;
    private double learningRatio;
    private Schedule schedule;

    public Student(String name, Knowledge knowledge, double learningRatio){
        this.name = name;
        this.knowledge = knowledge;
        this.learningRatio = learningRatio;
    }



    public void addSchedule(Schedule schedule){
        this.schedule = schedule;
    }

    public void useDevPlan(){
        //some check
        // addKnowledge();
    }


    public Knowledge getKnowledge(){
        return this.knowledge;
    }

    public void addKnowledge(Knowledge knowledge){
        this.knowledge.practicalKnowledge += knowledge.practicalKnowledge;
        this.knowledge.theoreticalKnowledge += knowledge.practicalKnowledge;
    }
}
