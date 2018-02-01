package testinteractive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaleStream {

	public static void main(String[] args){
		
		Product p1 = new Product(1);
		Product p2 = new Product(2);
		Product p3 = new Product(3);
		
		List<Sale> salelist = new ArrayList<>();
		
		Sale s1 = new Sale(1,p1,2);
		Sale s2 = new Sale(1,p2,3);
		
		Sale s3 = new Sale(2,p2,5);
		Sale s4 = new Sale(2,p3,10);
		
		Sale s5 = new Sale(3,p1,6);
		Sale s6 = new Sale(3,p2,8);
		
		salelist.add(s1);
		salelist.add(s2);
		salelist.add(s3);
		salelist.add(s4);
		salelist.add(s5);
		salelist.add(s6);
		
		
		List<Excel> excellist = new ArrayList<>();
		
		Excel e1 = new Excel(1,4);
		Excel e2 = new Excel(2,2);
		
		excellist.add(e1);
		excellist.add(e2);
		
		Map<Integer,Integer> excelmap = new HashMap<>();
		excelmap.put(1, 4);
		excelmap.put(2, 2);
		
		
		salelist.stream()
		.filter(p -> (excelmap.containsKey(p.getS_id()))).forEach(r-> r.setSold(excelmap.get(r.getS_id())*r.getQnty_used()));

		
		Map<Product, Integer> totalAgeByGender =
				salelist
			        .stream()
			        .collect(
			            Collectors.groupingBy(
			            		Sale::getProduct,                      
			                Collectors.reducing(
			                    0,
			                    Sale::getSold,
			                    Integer::sum)));
		
		totalAgeByGender.forEach((k,v)->System.out.println("Item : " + k.getPid() + " Count : " + v));
		
		System.out.println("Here");

		//salelist.stream().map(r -> r.getProduct()).
		
		//.map(r-> r.setSold(excelmap.get(p.getS_id())));
		
		
		
	}
	
}


class Excel{
	
	private int s_id;
	private int sold;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public Excel(int s_id, int sold) {
		super();
		this.s_id = s_id;
		this.sold = sold;
	}
	public Excel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

class Sale{
	
	private int s_id;
	private Product product;
	private int qnty_used;
	
	private int sold;
	
	
	
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQnty_used() {
		return qnty_used;
	}
	public void setQnty_used(int qnty_used) {
		this.qnty_used = qnty_used;
	}
	public Sale(int s_id, Product product, int qnty_used) {
		super();
		this.s_id = s_id;
		this.product = product;
		this.qnty_used = qnty_used;
	}
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

class Product{
	private int pid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
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
		Product other = (Product) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
	
	
}