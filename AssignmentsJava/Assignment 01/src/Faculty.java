class Faculty extends Employee {
    protected String officeHours, rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}