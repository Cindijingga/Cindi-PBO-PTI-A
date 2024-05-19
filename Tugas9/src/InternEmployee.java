public class InternEmployee extends Employee implements Contract {
    private String university;

    public InternEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, String university) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.university = university;
    }

    @Override
    public String workDetails() {
        return "Intern Employee - Working as an intern";
    }

    public void attendUniversityProgram() {
        System.out.println("Attending university program at: " + university);
    }

    public String getUniversityDetails() {
        return "University: " + university;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Intern attending training session.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Tracking contract duration for intern.");
    }
}
