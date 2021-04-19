package training;

import java.util.Comparator;

class salaryComparator implements Comparator<emp>{
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() != o2.getSalary()) {
			return o1.getSalary() - o2.getSalary();
		}
		return 0;
	}
}
