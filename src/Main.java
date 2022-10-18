import models.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentiHash = new HashSet<>();
        studentiHash.add(new Student("Ion", 9.5f));
        studentiHash.add(new Student("Maria", 8.5f));
        studentiHash.add(new Student("Mariana", 8.5f));
        studentiHash.add(new Student("Andrei", 9.4f));
        studentiHash.add(new Student("Vasile", 8.2f));

        System.out.println("HashSet");
        for (Student student : studentiHash) {
            System.out.println(student);
        }

        Set<Student> studentiTree = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        studentiTree.addAll(studentiHash);
        System.out.println("\nTreeSet");
        for (Student student : studentiTree) {
            System.out.println(student);
        }

        Map<String, Student> studentiMap = new HashMap<>();
        for (Student student : studentiTree) {
            studentiMap.put(student.getName(), student);
        }
        System.out.println("\nHashMap");
        for (Map.Entry<String, Student> entry : studentiMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        Map<String, Student> studentiTreeMap = new TreeMap<>(studentiMap);
        System.out.println("\nTreeMap");
        for (Map.Entry<String, Student> entry : studentiTreeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }
    }
}