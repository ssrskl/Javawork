package ����;

public class Book<S,N> {
	private S name;
	private N ID;
	private N Price;
	public Book(S name,N id,N price) {
		// TODO �Զ����ɵĹ��캯�����
		this.ID = id;
		this.name = name;
		this.Price = price;
	}
	public S getName() {
		return name;
	}
	public void setName(S name) {
		this.name = name;
	}
	public N getID() {
		return ID;
	}
	public void setID(N iD) {
		ID = iD;
	}
	public N getPrice() {
		return Price;
	}
	public void setPrice(N price) {
		Price = price;
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "IDΪ:"+this.ID+",����Ϊ:"+this.name+",�۸�Ϊ:"+this.Price;
	}
}
