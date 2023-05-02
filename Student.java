public class Student extends Section implements Rules {
    String name;
    //Address and contact info are private
    private String address;
    private  int contactno;
    public int attendance;
    int rollno;


    //To complain about a student get the contact number using this method
    public void complain(){
        System.out.println("Complain issued against "+name + " his contact info and address are: "+contactno+", "+address);
        System.out.println();
    }
    public void rules(String rules[]){
        System.out.println("School rules should be followed otherwise complaint will be issued:");
        for(String x : rules)
            System.out.println(x);
        System.out.println();

    }

    //Parametarised constructor to make a student object class and take all the necesarry parameters
    Student(String name, int contactno, String address, int rollno,int attendance){
        System.out.println(name+" enrolled with rollno: "+rollno+" ");
        System.out.println();
        this.name=name;
        this.rollno=rollno;
        this.contactno=contactno;
        this.address= address;
        this.attendance=attendance;
    }
    public String completeInfo() {
        return "Name='" + name + '\'' +
                ", ContactNo=" + contactno +
                ", Address='" + address + '\'' +
                ", RollNo=" + rollno +"\n";
    }

        //Default Constructor
    Student(){

    }
}

