public class Education {
    private String degree;
    private String major;
    private String university;
    private int year;

    public Education() {
    }

    public Education(String degree, String major, String university, int year) {
        this.degree = degree;
        this.major = major;
        this.university = university;
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getDisplayEdu() {
        String displayEdu = getDegree() +
                "\n" + getUniversity() + ", " + getYear();
        return displayEdu;
    }
}



