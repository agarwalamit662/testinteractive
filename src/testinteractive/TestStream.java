package testinteractive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args){
		
		
		List<A> list = new ArrayList<>();
		A a = new A("Amit","25");
		A b = new A("Nikar","23");
		A c = new A("Sumit","19");
		list.add(a);
		list.add(b);
		list.add(c);
		
		//list.stream().filter(fg-> !((A)fg).getAge().equalsIgnoreCase("25"));
		
		//List<A> newlist = list.stream().filter(fg-> !fg.getAge().equalsIgnoreCase("25")).collect(Collectors.toList());
		list= list.stream().filter(fg-> !fg.getAge().equalsIgnoreCase("25")); //.collect(Collectors.toList());
		System.out.println(list.size());
		//System.out.println(newlist.size());
		
		//List<A> newLis = list.stream().filter(e -> ((A)e).getAge().equalsIgnoreCase("25")).map(h -> h.cloneResults()).collect(Collectors.toList());
		
		/*for(A abc : newLis){
			abc.setAge("10");
		}
		
		System.out.println(list);
		System.out.println(newLis);*/
		
	}
	
}


class A{
	
	private String name;
	private String age;
	private A a;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public A(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public A (A a){
		this.a = a;
	}
	
	public A cloneResults(){
		return new A(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	
	
}