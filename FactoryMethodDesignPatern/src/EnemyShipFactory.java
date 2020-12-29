public class EnemyShipFactory  extends EnemyShip{

    public static EnemyShip makeEnemyShip(String line){

        if(line.equals("R")){
            return new RocketEnemyShip();

        }else if(line.equals("U")){
            return new UFOEnemyShip();
        }else{
            System.out.println("enter R or U");
            return null;
        }

    }
}
