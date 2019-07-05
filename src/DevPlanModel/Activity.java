package DevPlanModel;

import DevPlanModel.Knowledge.KnowledgeSource;
import DevPlanModel.Schedule.*;

import java.time.LocalDate;

public class Activity {
    private final KnowledgeSource knowledgeSource;
    private final Schedule schedule;

    private Period period = new Period(LocalDate.of(2016, 9, 1), LocalDate.of(2020, 6, 30));
    private Weekend weekend = new Weekend();
    private LastThursdayInMonths lastThursday = new LastThursdayInMonths();
    private Negation negation = new Negation();

    public Activity(KnowledgeSource knowledgeSource, Schedule schedule){
        this.knowledgeSource = knowledgeSource;
        this.schedule = schedule;
    }

    public void tryToApply(Student student, LocalDate date){
        if(period.isActive(date)){
            knowledgeSource.educate(student);
        }
        else if(weekend.isActive(date)){
            knowledgeSource.educate(student);
        }
        else if(lastThursday.isActive(date)){
            knowledgeSource.educate(student);
        }
        else if(negation.isActive(date)){
            knowledgeSource.educate(student);
        }
    }
}
