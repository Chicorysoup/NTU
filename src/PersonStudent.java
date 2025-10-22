public class PersonStudent extends Person{
    private String name;
    private String address;
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

    public String getProgram(){
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return "Student[Person[name=" + name + ", address=" + address
                + "], program=" + program + ", year=" + year
                + ", fee=" + fee + "]";
    }
}
