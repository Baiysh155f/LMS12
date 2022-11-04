public class Main {
    public static void main(String[] args) {
        University univer = new University();
        univer.setUniversity("Peaksoft");
        univer.setCountry("Kyrgyzstan");
        univer.setYears(2010);

        University univer2 = new University();
        univer2.setUniversity("Oxford");
        univer2.setCountry("UK");
        univer2.setYears(1096);

        University univer3 = new University();
        univer3.setUniversity("Horvard");
        univer3.setCountry("USA");
        univer3.setYears(1636);

        University univer4 = new University();
        univer4.setUniversity("OshSu");
        univer4.setCountry("Kyrgyzstan");
        univer4.setYears(1939);

        University[] universities = {univer, univer2, univer3, univer4};
        for (University university : universities) {
            System.out.println();
            System.out.println(university.getUniversity());
            System.out.println(university.getCountry());
            System.out.println(university.getYears());
        }
        System.out.println("____________________________________");

        School school = new School();
        school.setSchool("Peaksoft");
        school.setCourse("java");
        school.setTime(2);

        School school2 = new School();
        school2.setSchool("Mektep");
        school2.setCourse("himiya");
        school2.setTime(30);

        School school3 = new School();
        school3.setSchool("Kelechek");
        school3.setCourse("Algebra");
        school3.setTime(1);

        School[] schools = {school, school2, school3};
        for (School school1 : schools) {
            System.out.println();
            System.out.println(school1.getSchool());
            System.out.println(school1.getCourse());
            System.out.println(school1.getTime());
        }
        System.out.println("_________________________________________________");

        Car car = new Car();
        car.setModel("bmw");
        car.setName("m5");
        car.setSpeed(320);

        Car car2 = new Car();
        car2.setModel("mers");
        car2.setName("amg 5.5");
        car2.setSpeed(330);

        Car car3 = new Car();
        car3.setModel("toyota");
        car3.setName("camry");
        car3.setSpeed(350);

        Car[] cars = {car, car2, car3};
        for (Car car1 : cars) {
            System.out.println();
            System.out.println(car1.getModel());
            System.out.println(car1.getName());
            System.out.println(car1.getSpeed());
        }
        System.out.println("_______________________________________");

        Person person =new Person();
        person.setName("baiysh");
        person.setProfession("devoloper");
        person.setAge(22);

        Person person2 =new Person();
        person2.setName("aika");
        person2.setProfession("disainer");
        person2.setAge(18);

        Person person3 =new Person();
        person3.setName("Syamayk");
        person3.setProfession("front end");
        person3.setAge(20);

        Person[] people={person,person2,person3};
        for (Person person1:people) {
            System.out.println();
            System.out.println(person1.getName());
            System.out.println(person1.getProfession());
            System.out.println(person1.getAge());

        }



    }
}