package pers.pingweibo.interview.tree;

/**
 * 
 * @author pingweibo
 *
 */
public class Company {
	
	private String name;
	
	private String address;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	private String tel;
	
	public Company(String name,String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}

	
}
