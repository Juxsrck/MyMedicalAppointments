public class Patient extends User {
    //Atributos

    private String birthday;
    private String blood;
    private double weight;
    private double height;

    Patient (String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + " m.";
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public void setPhoneNumber(String phoneNumber) {

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Age='" + birthday + '\'' +
                ", blood='" + blood + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                '}';
    }
}
