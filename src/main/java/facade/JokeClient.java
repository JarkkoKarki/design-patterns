package facade;

public class JokeClient {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        try {
            String joke = facade.getAttributeValueFromJson(
                    "https://api.chucknorris.io/jokes/random",
                    "value"
            );
            System.out.println("Joke: " + joke);

            String baseCurrency = facade.getAttributeValueFromJson(
                    "https://api.fxratesapi.com/latest",
                    "base"
            );
            System.out.println("FX Rates: " + baseCurrency);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
