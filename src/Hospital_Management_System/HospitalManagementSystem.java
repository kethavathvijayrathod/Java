package Hospital_Management_System;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

// USER CLASS
class User implements Serializable {

    String username;
    String password;
    String role;

    User(String username, String password, String role) {

        this.username = username;
        this.password = password;
        this.role = role;
    }
}

// DOCTOR CLASS
class Doctor implements Serializable {

    int doctorId;
    String doctorName;
    String specialization;
    boolean available;

    Doctor(int doctorId, String doctorName,
           String specialization, boolean available) {

        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.available = available;
    }

    void displayDoctor() {

        System.out.println("----------------------------");
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Doctor Name    : " + doctorName);
        System.out.println("Specialization : " + specialization);
        System.out.println("Available      : " + available);
        System.out.println("----------------------------");
    }
}

// PATIENT CLASS
class Patient implements Serializable {

    int id;
    String name;
    String contact;
    String disease;
    String status;

    String doctorName;
    LocalDate appointmentDate;
    LocalTime appointmentTime;

    double consultationFee;
    double medicineFee;
    double totalBill;

    LocalDate registrationDate;

    Patient(int id, String name,
            String contact,
            String disease,
            String status,
            String doctorName,
            LocalDate appointmentDate,
            LocalTime appointmentTime,
            double consultationFee,
            double medicineFee) {

        this.id = id;
        this.name = name;
        this.contact = contact;
        this.disease = disease;
        this.status = status;

        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;

        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;

        this.totalBill = consultationFee + medicineFee;

        this.registrationDate = LocalDate.now();
    }

    void displayPatient() {

        System.out.println("\n================================");

        System.out.println("Patient ID          : " + id);
        System.out.println("Patient Name        : " + name);
        System.out.println("Contact Number      : " + contact);
        System.out.println("Disease             : " + disease);
        System.out.println("Status              : " + status);

        System.out.println("Doctor Name         : " + doctorName);

        System.out.println("Appointment Date    : "
                + appointmentDate);

        System.out.println("Appointment Time    : "
                + appointmentTime);

        System.out.println("Consultation Fee    : "
                + consultationFee);

        System.out.println("Medicine Fee        : "
                + medicineFee);

        System.out.println("Total Bill          : "
                + totalBill);

        System.out.println("Registration Date   : "
                + registrationDate);

        System.out.println("================================");
    }
}

// MAIN CLASS
public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<User> users = new ArrayList<>();

    static HashMap<Integer, Patient> patients
            = new HashMap<>();

    static ArrayList<Doctor> doctors
            = new ArrayList<>();

    static final String USER_FILE = "users.txt";

    static final String PATIENT_FILE = "patients.txt";

    static final String DOCTOR_FILE = "doctors.txt";

    static boolean isLoggedIn = false;

    static String currentRole = "";

    // MAIN METHOD
    public static void main(String[] args) {

        loadUsers();
        loadPatients();
        loadDoctors();

        // DEFAULT ADMIN
        if (users.isEmpty()) {

            users.add(new User(
                    "admin",
                    "admin123",
                    "ADMIN"));

            saveUsers();
        }

        int choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");

            System.out.println("1. User Registration");
            System.out.println("2. User Login");
            System.out.println("3. Change Password");

            System.out.println("4. Add Patient");
            System.out.println("5. Update Patient");
            System.out.println("6. Delete Patient");

            System.out.println("7. Search Patient By ID");
            System.out.println("8. Search Patient By Name");

            System.out.println("9. View All Patients");

            System.out.println("10. Add Doctor");
            System.out.println("11. View Doctors");

            System.out.println("12. Logout");

            System.out.println("13. Exit");

            System.out.print("Enter Choice : ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        registerUser();
                        break;

                    case 2:
                        loginUser();
                        break;

                    case 3:
                        changePassword();
                        break;

                    case 4:
                        addPatient();
                        break;

                    case 5:
                        updatePatient();
                        break;

                    case 6:
                        deletePatient();
                        break;

                    case 7:
                        searchPatientById();
                        break;

                    case 8:
                        searchPatientByName();
                        break;

                    case 9:
                        viewPatients();
                        break;

                    case 10:
                        addDoctor();
                        break;

                    case 11:
                        viewDoctors();
                        break;

                    case 12:
                        logout();
                        break;

                    case 13:
                        System.out.println("Application Closed!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } catch (InputMismatchException e) {

                System.out.println("Please Enter Numbers Only!");

                sc.nextLine();

                choice = 0;
            }

        } while (choice != 13);
    }

    // CHECK LOGIN
    static boolean checkLogin() {

        if (!isLoggedIn) {

            System.out.println("Please Login First!");

            return false;
        }

        return true;
    }

    // REGISTER USER
    static void registerUser() {

        sc.nextLine();

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        users.add(new User(username,
                password,
                "USER"));

        saveUsers();

        System.out.println("Registration Successful!");
    }

    // LOGIN
    static void loginUser() {

        sc.nextLine();

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        boolean found = false;

        for (User user : users) {

            if (user.username.equals(username)
                    && user.password.equals(password)) {

                found = true;

                isLoggedIn = true;

                currentRole = user.role;

                System.out.println("Login Successful!");

                System.out.println("Role : "
                        + currentRole);

                break;
            }
        }

        if (!found) {

            System.out.println("Invalid Username or Password!");
        }
    }

    // LOGOUT
    static void logout() {

        isLoggedIn = false;

        currentRole = "";

        System.out.println("Logged Out Successfully!");
    }

    // CHANGE PASSWORD
    static void changePassword() {

        sc.nextLine();

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Old Password : ");
        String oldPassword = sc.nextLine();

        boolean found = false;

        for (User user : users) {

            if (user.username.equals(username)
                    && user.password.equals(oldPassword)) {

                System.out.print("Enter New Password : ");

                String newPassword = sc.nextLine();

                user.password = newPassword;

                saveUsers();

                found = true;

                System.out.println("Password Changed Successfully!");

                break;
            }
        }

        if (!found) {

            System.out.println("Invalid Username or Password!");
        }
    }

    // ADD DOCTOR
    static void addDoctor() {

        if (!checkLogin()) {
            return;
        }

        if (!currentRole.equals("ADMIN")) {

            System.out.println("Only Admin Can Add Doctors!");

            return;
        }

        System.out.print("Enter Doctor ID : ");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Doctor Name : ");

        String name = sc.nextLine();

        System.out.print("Enter Specialization : ");

        String specialization = sc.nextLine();

        Doctor doctor = new Doctor(id,
                name,
                specialization,
                true);

        doctors.add(doctor);

        saveDoctors();

        System.out.println("Doctor Added Successfully!");
    }

    // VIEW DOCTORS
    static void viewDoctors() {

        if (doctors.isEmpty()) {

            System.out.println("No Doctors Available!");

        } else {

            for (Doctor doctor : doctors) {

                doctor.displayDoctor();
            }
        }
    }

    // ADD PATIENT
    static void addPatient() {

        if (!checkLogin()) {
            return;
        }

        System.out.print("Enter Patient ID : ");

        int id = sc.nextInt();

        if (patients.containsKey(id)) {

            System.out.println("Duplicate ID Not Allowed!");

            return;
        }

        sc.nextLine();

        System.out.print("Enter Patient Name : ");

        String name = sc.nextLine();

        System.out.print("Enter Contact Number : ");

        String contact = sc.nextLine();

        System.out.print("Enter Disease : ");

        String disease = sc.nextLine();

        System.out.print("Enter Status : ");

        String status = sc.nextLine();

        System.out.print("Enter Doctor Name : ");

        String doctorName = sc.nextLine();

        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");

        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Appointment Time (HH:MM): ");

        LocalTime time = LocalTime.parse(sc.nextLine());

        System.out.print("Enter Consultation Fee : ");

        double consultationFee = sc.nextDouble();

        System.out.print("Enter Medicine Fee : ");

        double medicineFee = sc.nextDouble();

        Patient patient = new Patient(
                id,
                name,
                contact,
                disease,
                status,
                doctorName,
                date,
                time,
                consultationFee,
                medicineFee
        );

        patients.put(id, patient);

        savePatients();

        System.out.println("Patient Added Successfully!");
    }

    // UPDATE PATIENT
    static void updatePatient() {

        if (!checkLogin()) {
            return;
        }

        System.out.print("Enter Patient ID : ");

        int id = sc.nextInt();

        if (!patients.containsKey(id)) {

            System.out.println("Patient Not Found!");

            return;
        }

        sc.nextLine();

        System.out.print("Enter New Name : ");

        String name = sc.nextLine();

        System.out.print("Enter New Contact : ");

        String contact = sc.nextLine();

        System.out.print("Enter New Disease : ");

        String disease = sc.nextLine();

        System.out.print("Enter New Status : ");

        String status = sc.nextLine();

        System.out.print("Enter Doctor Name : ");

        String doctorName = sc.nextLine();

        System.out.print("Enter Appointment Date : ");

        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Appointment Time : ");

        LocalTime time = LocalTime.parse(sc.nextLine());

        System.out.print("Enter Consultation Fee : ");

        double consultationFee = sc.nextDouble();

        System.out.print("Enter Medicine Fee : ");

        double medicineFee = sc.nextDouble();

        Patient patient = new Patient(
                id,
                name,
                contact,
                disease,
                status,
                doctorName,
                date,
                time,
                consultationFee,
                medicineFee
        );

        patients.put(id, patient);

        savePatients();

        System.out.println("Patient Updated Successfully!");
    }

    // DELETE PATIENT
    static void deletePatient() {

        if (!checkLogin()) {
            return;
        }

        if (!currentRole.equals("ADMIN")) {

            System.out.println("Only Admin Can Delete Records!");

            return;
        }

        System.out.print("Enter Patient ID : ");

        int id = sc.nextInt();

        if (patients.containsKey(id)) {

            patients.remove(id);

            savePatients();

            System.out.println("Patient Deleted Successfully!");

        } else {

            System.out.println("Patient Not Found!");
        }
    }

    // SEARCH BY ID
    static void searchPatientById() {

        System.out.print("Enter Patient ID : ");

        int id = sc.nextInt();

        if (patients.containsKey(id)) {

            patients.get(id).displayPatient();

        } else {

            System.out.println("Patient Not Found!");
        }
    }

    // SEARCH BY NAME
    static void searchPatientByName() {

        sc.nextLine();

        System.out.print("Enter Patient Name : ");

        String searchName = sc.nextLine();

        boolean found = false;

        for (Patient patient : patients.values()) {

            if (patient.name.equalsIgnoreCase(searchName)) {

                patient.displayPatient();

                found = true;
            }
        }

        if (!found) {

            System.out.println("Patient Not Found!");
        }
    }

    // VIEW ALL PATIENTS
    static void viewPatients() {

        if (patients.isEmpty()) {

            System.out.println("No Records Found!");

        } else {

            for (Patient patient : patients.values()) {

                patient.displayPatient();
            }
        }
    }

    // SAVE USERS
    static void saveUsers() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(USER_FILE));

            oos.writeObject(users);

            oos.close();

        } catch (Exception e) {

            System.out.println("Error Saving Users!");
        }
    }

    // LOAD USERS
    static void loadUsers() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(USER_FILE));

            users = (ArrayList<User>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            System.out.println("User File Not Found!");
        }
    }

    // SAVE PATIENTS
    static void savePatients() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(PATIENT_FILE));

            oos.writeObject(patients);

            oos.close();

        } catch (Exception e) {

            System.out.println("Error Saving Patients!");
        }
    }

    // LOAD PATIENTS
    static void loadPatients() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(PATIENT_FILE));

            patients = (HashMap<Integer, Patient>)
                    ois.readObject();

            ois.close();

        } catch (Exception e) {

            System.out.println("Patient File Not Found!");
        }
    }

    // SAVE DOCTORS
    static void saveDoctors() {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(DOCTOR_FILE));

            oos.writeObject(doctors);

            oos.close();

        } catch (Exception e) {

            System.out.println("Error Saving Doctors!");
        }
    }

    // LOAD DOCTORS
    static void loadDoctors() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(DOCTOR_FILE));

            doctors = (ArrayList<Doctor>)
                    ois.readObject();

            ois.close();

        } catch (Exception e) {

            System.out.println("Doctor File Not Found!");
        }
    }
}
