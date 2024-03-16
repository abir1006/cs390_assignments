package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> studentHasMap = new HashMap<>();

		for (Student s: students) {
			Key key = new Key(s.getFirstName(), s.getLastName());
			studentHasMap.put(key, s);
		}

		return studentHasMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements

		double sum = 0.0;
		int studentCount = 0;

		for (Student s: maps.values()) {
			studentCount++;
			sum += s.getGpa();
		}

		return studentCount == 0 ? 0.0 : sum/studentCount;
}
}
