public class Grade
{
    int grade;
    //Subjects srudied by a particular grade
    String subjects[];
    //Number of sections in a grade
    int sections;
    //Parametarised Constructor
    Grade(int grade,int sections,String subjects[])

    {
        this.subjects=new String[10];
        this.subjects = subjects;
        this.grade=grade;
        this.sections=sections;
        System.out.println("Grade "+grade+" having "+sections+" sections with subjects:");
        for (String str : subjects)
            System.out.print(str+" ");
        System.out.println();
    }
    //Default constructor
    Grade()
    {

    }
}
