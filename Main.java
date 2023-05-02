public class Main {
    public static void main(String[] args) {

       //Enrolling Students
       Student s1=new Student("Abhinav Uniyal",992312415,"Shampur,Rishikesh",2301,89);
       Student s2=new Student("Devansh Bartwal",992313455,"Tilak Chowk,Rishikesh",6981,98);
       Student s3=new Student("Nimit Jain",864512415,"Dehradun road,Rishikesh",8501,77);
       Student s4=new Student("Aviral Joshi",998588415,"Railway Road,Rishikesh",1768,67);

       //To get complete details of a student
       System.out.println(s1.completeInfo());

       //Printing rules for students to follow
       String rules[] = {"1. Violence is strictly prohibited","2. Bunking of classes not allowed","3. Use of mobile phones is not allowed during classes","4. Respect teachers and fellow students"};
       s1.rules(rules);

       String subjectsofgrade12[]={"Maths","English","Physics","Chemistry","Physical education"};

       //Creating new Section
       Section g12=new Section(12,3,subjectsofgrade12,'G',40,"Mr Ramesh");
       //Getting timetable for exams
       g12.timetable();
       //Getting attendance of particular students
       g12.getAttendence(s1);
       g12.getAttendence(s4);
       //Getting previously compiled result of students
       g12.result();
       //Complaining against a Student
       s4.complain();

    }
}
