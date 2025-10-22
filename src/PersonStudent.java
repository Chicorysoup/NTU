public class PersonStudent extends Person{
    private String program;
    private int year;
    private double fee;

    public PersonStudent(String n, String addy, String p, int year, double fee){
        name = n;
        address = addy;
        program = p;
        this.year = year;
        this.fee = fee;
    }
}
