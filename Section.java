public class Section extends Grade implements Exam , Attendence{
    char Section;
    int Studentstrength;
    String Classteacher;
    //Parametarised Constructor
    Section(int grade,int sections,String subjects[],char Section,int Studentstrength,String Classteacher){
        super(grade, sections, subjects);
        this.Section=Section;
        this.Studentstrength=Studentstrength;
        this.Classteacher=Classteacher;
        System.out.println();
        System.out.println("Section "+Section+" created of grade "+grade+" having class strength "+Studentstrength+" and "+Classteacher+" as class teacher");
        System.out.println();
    }
    //Different Methods:
    public void getAttendence(Student s){
        if(s.attendance>=75)
        System.out.println(s.name+" has attendance:"+s.attendance+"%");
        else
            System.out.println(s.name+" has short attendance:"+s.attendance+"%");
        System.out.println();
    }
    public void timetable(){
        System.out.println("The timetable for Finals is:");
        System.out.println("Physical education-22 June 2023");
        System.out.println("Physics-24 June 2023");
        System.out.println("Chemistry-26 June 2023");
        System.out.println("Maths-28June 2023");
        System.out.println();
    }
    public void result(){
        System.out.println("The result of Semi-Finals is:");
        System.out.println("1.Abhinav Uniyal : Maths-100, Physics-100, Chemistry-100, Physical Education-100, English-98");
        System.out.println("1.Devansh Bartwal : Maths-95, Physics-85, Chemistry-88, Physical Education-92, English-95");
        System.out.println("1.Nimit Jain : Maths-98, Physics-89, Chemistry-98, Physical Education-72, English-75");
        System.out.println("1.Aviral Joshi : Maths-85, Physics-88, Chemistry-99, Physical Education-85, English-66");
        System.out.println();

    }
    Section(){

    }
}
