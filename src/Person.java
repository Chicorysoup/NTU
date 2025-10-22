public class Person {
    private String name;
    private String address;

    public Person(String n, String addy){
        name = n;
        address = addy;
    }

    public Person(){

    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddy){
        address = newAddy;
    }

    public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";
    }
}
