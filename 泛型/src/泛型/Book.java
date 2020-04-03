package 泛型;

public class Book<S,N> {
	private S name;
	private N ID;
	private N Price;
	public Book(S name,N id,N price) {
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的方法存根
		return "ID为:"+this.ID+",名称为:"+this.name+",价格为:"+this.Price;
	}
}
