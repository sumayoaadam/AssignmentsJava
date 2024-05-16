class Student extends Person {
    public static final int FRESHMAN = 1, SOPHOMORE = 2, JUNIOR = 3, SENIOR = 4;
    protected int status;

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name;
    }
}