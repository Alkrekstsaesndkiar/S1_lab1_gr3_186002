class Receipt{
	List<Item> lista;

	public Receipt(List<Item> lista) {
		this.lista = lista;
	}

	public List<Item> getLista() {
		return lista;
	}

	public void setLista(List<Item> lista) {
		this.lista = lista;
	}

	public void addItem(Item item)
	{
		lista.add(item);
	}

	public void removeItem(Item item)
	{
		lista.remove(item);
	}
}
class Item {
	int id;
	String name;
	double price;
	char ddv;
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	public Item(int id, String name, double price, char ddv) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ddv = ddv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getDdv() {
		return ddv;
	}

	public void setDdv(char ddv) {
		this.ddv = ddv;
	}

	double getTaxReturn () {
		if(ddv=="A")
			return price*0.18;
		if(ddv=="B")
			return price*0.05;
		if(ddv=='V')
			return 0;
	}
}