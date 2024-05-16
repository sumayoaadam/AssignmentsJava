class Staff extends Employee {
    protected String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name;
    }
}