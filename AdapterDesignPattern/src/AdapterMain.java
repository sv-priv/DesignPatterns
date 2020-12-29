public class AdapterMain {
    public static void main(String[] args) {

        EnemyAttacker e = new EnemyRobotAdapter(new EnemyRobot());
        e.assignDriver("deeerp");
        e.driveForward();
        e.fireWeapon();

    }
}
