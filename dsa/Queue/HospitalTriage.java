import java.util.PriorityQueue;

public class HospitalTriage {

    static class Patient {

        int priority;
        String name;

        Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
    }

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public Patient peekNextPatient() {
