/* Artificial Intelligence Module
 * designated for Art of Combat
 * Author: Walter Gress
 * Date: November, 2015
 * Version: 1.01
 */





package home;

import simulation.SimulatedSoldier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main():: Running main");
		MainAIEngine mainEngine = new MainAIEngine();
		//Soldier st = new Soldier();
		SimulatedSoldier st = new SimulatedSoldier();
		mainEngine.sim_soldiers.listOfSoldiers.get(0).run(st);
		
	}

}
