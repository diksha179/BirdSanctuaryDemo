package com.blz.bridsanctuary;
import java.util.Scanner;

import com.blz.bridsanctuary.Bird.Colour;

public class BirdSanctuaryDemo {
	static final Scanner SC = new Scanner(System.in);
	// static BirdSanctuaryManager birdSanctuaryManager =
	// BirdSanctuaryManager.getInstance();

	public void showMenu() {
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
	
			System.out.println("1.Add Bird\n2.Remove Bird\n3.Update Bird" 
					+ "\n4.Print all Bird\n5.Print Flyable Bird\n"
					+ "6.Print Swimmable Bird\n7.Print Eating Bird\n0.Exit\nHello");
			System.out.println("\nSelect From Menu");
			int choice = SC.nextInt();

			switch (choice) {
			case 1:
				Bird bird = new Bird();
				System.out.println("Enter the colour Option");
				System.out.println("\n1.WHITE 2.BLACK 3.YELLOW 4.GREEN 5.GRAY" 
								+ "\n Enter the Option");
				int option = SC.nextInt();
				switch(option) {
					case 1: 
						bird.colour = Colour.WHITE;
						System.out.println(bird.colour);
						break;
					case 2:
						bird.colour = Colour.BLACKWHITE;
						System.out.println(bird.colour);
						break;
					case 3: 
						bird.colour = Colour.YELLOW;
						System.out.println(bird.colour);
						break;
					case 4: 
						bird.colour = Colour.GREEN;
						System.out.println(bird.colour);
						break;
					case 5: 
						bird.colour = Colour.GRAY;
						System.out.println(bird.colour);
						break;
				
					
					default: 
						System.out.println("This "+option+" option colour doesn't exists");
						break;
				}

				System.out.println("Enter the Bird Name");
				bird.birdName = SC.next();
				System.out.println(bird.birdName);
				
				System.out.println("Enter the Bird ID");
				bird.id = SC.next();
				System.out.println(bird.id);
				
				System.out.println("Enter the Bird isflyable (true or false)");
				bird.isflyable = SC.nextBoolean();
				System.out.println(bird.isflyable);
				
				System.out.println("Enter the Bird isSwimmable (true or false)");
				bird.isSwimmable = SC.nextBoolean();
				System.out.println(bird.isSwimmable);
						
				birdSanctuaryManager.add(bird);
				
				break;
			case 2:
				System.out.println("Enter The Bird ID");
				String id = SC.next();
//				birdSanctuaryManager.remove(birdSanctuaryManager.getBird(id));
				Bird b = birdSanctuaryManager.getBird(id);
				birdSanctuaryManager.remove(b);
				break;
			case 3:
				System.out.println("Enter The Bird ID");
				break;
			case 4:
				birdSanctuaryManager.print();
				break;
			case 5:
				birdSanctuaryManager.printFlyable();
				break;
			case 6:
				birdSanctuaryManager.printSwimmable();
				break;
			case 7:
				birdSanctuaryManager.printEatable();
				break;
			default:
				System.out.println("Select from Option");
				break;
			}
		}
	}

	public static void main(String[] args) {
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();

		birdSanctuaryManager.print();
		birdSanctuaryManager.printFlyable();
		birdSanctuaryManager.printSwimmable();
		birdSanctuaryManager.printEatable();

		BirdSanctuaryDemo birdSanctuary = new BirdSanctuaryDemo();
		birdSanctuary.showMenu();
	}
}
//Dove dove = new Dove();
//dove.id = "D1";
//Penguin penguin = new Penguin();
//penguin.id = "Pe1";
//Duck duck = new Duck();
//duck.id = "Du1";
//Parrot parrot = new Parrot();
//parrot.id = "Pa1";

//birdSanctuaryManager.add(dove);
//birdSanctuaryManager.add(penguin);
//birdSanctuaryManager.add(duck);
//birdSanctuaryManager.add(parrot);

