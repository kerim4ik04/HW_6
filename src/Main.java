public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.weapon.setWeaponType(WeaponType.FIRE_SHOOT);
        boss.weapon.setWeaponName("писталет");
        System.out.println("boss health: " + boss.getHealth() + " boss damage: " +
                boss.getDamage() + " boss weapon type: " + boss.weapon.getWeaponType() + " boss weapon name: " + boss.weapon.getWeaponName());

    }
}