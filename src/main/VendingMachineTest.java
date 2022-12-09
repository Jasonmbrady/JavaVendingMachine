package main;

import models.Item;
import models.VendingMachine;

public class VendingMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item snickers = new Item("Snickers", .75, 10);
		Item butterfinger = new Item("Butterfinger", .75, 10);
		Item twix = new Item("Twix", .75, 10);
		Item kitkat = new Item("Kit Kat", .75, 10);
		Item popcorn = new Item("Bag of Popcorn", 1.50, 4);
		Item twinkie = new Item("Twinkie", 1.0, 4);
		Item cheetos = new Item("Flamin Hot Cheetos", .50, 10);
		Item doritos = new Item("Nacho Cheese Doritos", .75, 10);
		Item skittles = new Item("Skittles", .75, 10);
		Item goldfish = new Item("Goldfish", .75, 10);
		Item swedishFish = new Item("Swedish Fish", .75, 10);
		Item chipsAhoy = new Item("chipsAhoy", .75, 10);
		
		Item[][] machineContents = {{snickers, butterfinger, twix}, {kitkat, popcorn, twinkie}, {cheetos, doritos, skittles}, {goldfish, swedishFish, chipsAhoy}};
		VendingMachine snackAttack = new VendingMachine(machineContents);
		
		snackAttack.depositMoney(5.00);
		Item itemBought = snackAttack.buy("c,1");
		System.out.println("You bought a "+itemBought.getName());
//		System.out.println("Here is your $" + snackAttack.refund() + " back!");
		System.out.println(String.format("Here is your $%,.4f back!", snackAttack.refund()));
		
		
	}

}
