class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        List<int[]> cars = new ArrayList<>();

        for(int i=0; i<n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars.add(new int[]{position[i], 0});
        }

        List<double[]> carData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            carData.add(new double[]{position[i], time});
        }

        // Sort cars by position descending
        carData.sort((a, b) -> Double.compare(b[0], a[0]));

        int fleet = 0;
        double topTime = -1.0;

        for (double[] car : carData) {
            double time = car[1];
            if (time > topTime) {
                fleet++;
                topTime = time;
            }
        }

        return fleet;

    }
}
