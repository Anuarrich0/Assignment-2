public class Person implements IPayable, Comparable<Person> {
    private static int helper_static_variable = 1;
    private int id;
    private String name;
    private String surname;

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }
    public Person(){
      this.id = helper_static_variable++;
      this.name = "";
      this.surname = "";
    }
    public Person(String name, String surname){
        this.id = helper_static_variable++;
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        return id + "." + name + " " + surname;
    }
    public String getPosition(){
        return "Student";
    }
    public double getPaymentAmount() {
        return 0.0;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}