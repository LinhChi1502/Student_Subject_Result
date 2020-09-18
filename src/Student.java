public class Student {
    private String name;
    private int ID;
    private Subject[] subjects;

    public Student() {

    }

    public Student(String name, int ID, Subject[] subjects) {
        this.name = name;
        this.ID = ID;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        String str = this.name + " with ID " + this.ID + " study subject ";
        for (Subject subject : subjects) {
            str += subject.toString() + "\n";
        }
        return str;
    }

}
