class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 1;
        int attack = 0;
        int continuity = 0;
        int maxHealth = health;
        while (attack < attacks.length) {
            if (attacks[attack][0] == time) {
                health -= attacks[attack][1];
                if (health <= 0) {
                    return -1;
                }
                attack += 1;
                continuity = 0;
            } else {
                continuity += 1;
                health += bandage[1];

                if (continuity == bandage[0]) {
                    health += bandage[2];
                    continuity = 0;
                }

                if (health > maxHealth) {
                    health = maxHealth;
                }
            }

            time += 1;
        }
        
        return health;
    }
}