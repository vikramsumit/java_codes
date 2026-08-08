class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollarnote = 0;
        int tendollarnote = 0;

        for (int customerbill : bills) {
            if (customerbill == 5) {
                fivedollarnote++;
            } else if (customerbill == 10) {
                if (fivedollarnote > 0) {
                    fivedollarnote--;
                    tendollarnote++;
                } else {
                    return false;
                }
            }
            // customerbill == 20
            else {
                if (fivedollarnote > 0 && tendollarnote > 0) {
                    fivedollarnote--;
                    tendollarnote--;
                } else if (fivedollarnote >= 3) {
                    fivedollarnote -= 3;
                } else {
                    return false;
                }

            }
        }

        return true;

    }
}