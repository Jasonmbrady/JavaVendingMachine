package models;

public class VendingMachine {
	private Item[][] contents = new Item[4][3];
	private Double deposited = 0.0;
	
	public VendingMachine() {};
	public VendingMachine(Item[][] contents) {
		this.contents = contents;
	}
	
	public Double depositMoney(Double amount) {
		// increment deposited by amount
		if (amount > 0.0) {
			this.deposited += amount;
		}
		return deposited;
	}
	
	public Double refund() {
		Double amountRefunded = deposited;
		deposited = 0.0;
		return amountRefunded;
		
	}
	
	public Item buy(String selection) {
		// customer makes selection: String "<letter>,<number>"
		// Validate
		String[] selectArr = selection.split(",", 2);
//		System.out.println(selectArr[0]);
//		System.out.println(selectArr[1]);
		if (!selectArr[0].toLowerCase().equals("a") && !selectArr[0].toLowerCase().equals("b") && !selectArr[0].toLowerCase().equals("c")) {
			System.out.println("Letter issue");
			return null;
		}
		if (Integer.parseInt(selectArr[1]) < 0 || Integer.parseInt(selectArr[1]) > 3) {
			System.out.println("Integer issue");
			return null;
		}
		int letterIndex;
		// translate into (y, x)
		switch(selectArr[0].toLowerCase()) {
			case "a":
				letterIndex = 0;
				break;
			case "b":
				letterIndex = 1;
				break;
			default:
				letterIndex = 2;
				
		}
		int[] itemSelected = {Integer.parseInt(selectArr[1]), letterIndex};
		
		Item item = contents[itemSelected[0]][itemSelected[1]];
		// check deposited vs item.price. check item.quantityInStock > 0;
		if (deposited >= item.getPrice() && item.getQuantityInStock() > 0) {
			deposited -= item.getPrice();
			item.setQuantityInStock(item.getQuantityInStock() - 1);
			return item;
		}
		else {
			System.out.println("Sorry, please try another selection.");
			return null;			
		}
		// if both are true, subtract item.cost from deposited
		// decrement item.quantityInStock by 1
		// return Item object;
	}
	public Item[][] getContents() {
		return contents;
	}
	public void setContents(Item[][] contents) {
		this.contents = contents;
	}
	public Double getDeposited() {
		return deposited;
	}
	
	
}
