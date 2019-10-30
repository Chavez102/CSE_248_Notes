package p1;

public class Demo {

	public static void main(String[] args) {
		EnemyShipFactory factory=new EnemyShipFactory();
		EnemyShip anShip=factory.makeEnemyShipt("U");
		doStuff(anShip);

	}
	public static void doStuff(EnemyShip anEnemyShip) {
		anEnemyShip.display();
		anEnemyShip.followHeroShip();
		anEnemyShip.shoots();
		
	}

}
