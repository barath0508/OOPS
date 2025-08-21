package hospital;
class Patient {
    // Encapsulation: private fields
    private String name;
    private int age;
    private String healthData;

    // Constructor
    public Patient(String name, int age, String healthData) {
        this.name = name;
        this.age = age;
        this.healthData = healthData;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter and Setter for Health Data
    public String getHealthData() {
        return healthData;
    }
    public void setHealthData(String healthData) {
        this.healthData = healthData;
    }
}

// Main Class
public class Hospital_Data {
    public static void main(String[] args) {
        // Create Patient object
        Patient p1 = new Patient("Arun", 25, "Healthy - No Issues");

        // Display details using getters
        System.out.println("Patient Name: " + p1.getName());
        System.out.println("Patient Age: " + p1.getAge());
        System.out.println("Health Data: " + p1.getHealthData());

        // Update health data
        p1.setHealthData("Diabetic - Under Medication");
        System.out.println("Updated Health Data: " + p1.getHealthData());
    }
}
