package school.management.school;

//this class keeps track of students like name, id, fees, grade
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constructor
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid=0; //inital 
        this.feesTotal=30000;//fee for year


    }
    // not going to alter student's id and name and feesTotal, so not using set method for them
   
    public void setGrade(int grade){
        this.grade = grade;
    }


    //updates whenever a student pays fee
    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }


          
}
