public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot e;

    public EnemyRobotAdapter(EnemyRobot e){
        this.e = e;
    }
    @Override
    public void fireWeapon() {
        this.e.smashWithHand();
    }

    @Override
    public void driveForward() {
        this.e.walkForward();
    }

    @Override
    public void assignDriver(String s) {
        this.e.reactToHuman(s);
    }
}
