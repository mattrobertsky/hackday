package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MacTaxController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/calculate")
    public Result calculate(@RequestParam("apps") Integer apps, @RequestParam("macs") Integer macs) {

        final String macCostURL = "http://localhost:9002/rain-mac-price.json";
        final String appCostURL = "http://localhost:9003/apple-mac-price.json";

        Float macCost = new RestTemplate().getForObject(macCostURL, Price.class).getPrice();
        Float appCost = new RestTemplate().getForObject(appCostURL, Price.class).getPrice();

        Float appsCost = appCost * apps;
        Float macsCost = macCost * macs;
        Float total = appsCost + macsCost;

        return new Result(apps, macs, macCost, appCost, macsCost, appsCost, total);

    }
}
