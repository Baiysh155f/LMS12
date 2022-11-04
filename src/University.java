public class University {
    private String university;
    private String country;
    private int years;

    void setUniversity(String university) {
        this.university = university;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setYears(int years){
        this.years=years;
    }
    String getUniversity() {
        return university;
    }

    String getCountry() {
        return country;
    }

    int getYears(){
        return years;
    }
}
