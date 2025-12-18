package day_17;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int loop = (v1.length > v2.length) ? v1.length : v2.length;
        int equality = 0;
        int p1 = 0, p2 = 0;
        while (equality == 0 && loop-- > 0) {
            int a = (p1 < v1.length) ? Integer.parseInt(v1[p1]) : 0;
            int b = (p2 < v2.length) ? Integer.parseInt(v2[p2]) : 0;
            if (a > b) equality = 1;
            else if (a < b) equality = -1;
            p1++;
            p2++;
        }
        return equality;
    }
}
