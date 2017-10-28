/*package com.fa.component.eapps.receipt;

import java.util.Comparator;

public class Empl {
	
	private int salary;
	private int age;
	
	public Empl(int ag,int sal){
		this.age=ag;
		this.salary=sal;
	}

//	@Override
//	public int compareTo(Empl o) {
//		
//		return (this.age-o.age);
//	}
	
    public static Comparator<Empl> SalaryComparator = new Comparator<Empl>() {

        @Override
        public int compare(Empl e1, Empl e2) {
            return (int) (e1.salary- e2.salary);
        }
    };
    
    public static Comparator<Empl> AgeComparator = new Comparator<Empl>() {

        @Override
        public int compare(Empl e1, Empl e2) {
            return e1.age - e2.age;
        }
    }; 
    
	

	@Override
	public String toString() {
		return "Empl [salary=" + salary + ", age=" + age + "]";
	}	
}
*/