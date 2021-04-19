package training;

import java.util.Comparator;

class AgeComparator implements Comparator<emp>{

	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() != o2.getAge()) {
			return o1.getAge() + o2.getAge();
		}
		else {
			return o1.getSalary() + o2.getSalary();
		}
	}
}

