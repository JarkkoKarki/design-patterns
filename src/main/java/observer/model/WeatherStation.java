package observer.model;

public class WeatherStation extends Observable implements Runnable {
    private int temperature;
    int MAX_TEMP = 40;
    int MIN_TEMP = -20;

    public WeatherStation() {
        // Alkulämpötila
        temperature = -20 + (int) (Math.random() * 40);
        System.out.println("Temperature: " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000+(int)(Math.random()*3000));
                int num = (int) (Math.random() * 100);
                if (num <= 50 && temperature < MAX_TEMP) {
                    temperature++;

                } else if (temperature > MIN_TEMP) {
                    temperature--;
                }
                System.out.println("Temperature: " + temperature + "°C");
                notifyObservers(temperature);
            }
        } catch (InterruptedException e) {
            System.out.println("WeatherStation interrupted");
        }
    }

}
