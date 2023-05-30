package controllers.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RandomController {

    @GetMapping("/uuid")
    public @ResponseBody String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    @GetMapping("/exchange")
    public @ResponseBody String getRandomExchangeRate() {
        double exchangeRate = Math.random() * 10;
        return Double.toString(exchangeRate);
    }

    @GetMapping("/exchange/{currency}")
    public @ResponseBody String getExchangeRateForCurrency(@PathVariable String currency) {
        double exchangeRate = Math.random() * 10;
        return "Exchange rate for " + currency + ": " + Double.toString(exchangeRate);
    }
}
