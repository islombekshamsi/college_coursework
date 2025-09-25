// class contains the logic for categorizing temperature values
// tempcheck method returns a string category based on the temperature value
public class TemperatureCheck {
    public String tempcheck(int temperature) {
        if (temperature < 0)
            return "FREEZING";
        else if (temperature <= 15)
            return "COLD";
        else if (temperature <= 30)
            return "WARM";
        else if (temperature <= 40)
            return "HOT";
        else
            return "VERY HOT";
    }
}
