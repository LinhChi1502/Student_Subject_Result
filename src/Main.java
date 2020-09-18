public class Main {
    public static void main(String[] args) {
        double[] points = {7,8,9};
        Result result = new Result(points);
        result.setAvg();

        Subject engSubject = new Subject("EN01","English",result);
        Subject vieSubject = new Subject("VN01","VN",result);
        Subject[] subjects = {engSubject,vieSubject};

        Student chiStudent = new Student("Chi",1000,subjects);
        System.out.println(chiStudent);

    }
}
