public class Patient {
    private int patientId;
    private String fullName;
    private int age;
    private String gender;


    public Patient(int patientId, String fullName, int age, String gender) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }
    public Patient() {
        this.patientId = 0;
        this.fullName = "Unknown";
        this.age = 0;
        this.gender= "Unknown";
    }

    public int getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isMinor() {
        return age < 18;
    }

    public String getAgeCategory() {
        if (age < 18) return "Жас адам";
        if (age < 60) return "Кәрі адам";
        return "Ересек";
    }

    public void celebrateBirthday() {
        this.age += 1;
    }

    public String toString() {
        return "Patient{patientId=" + patientId +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}