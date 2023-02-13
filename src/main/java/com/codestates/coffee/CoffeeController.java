package com.codestates.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoffeeController {
    @PostMapping
    public String postCoffee(@RequestParam("korName") String korName,
                             @RequestParam("engName") String engName) {
        System.out.println("# korName" + korName);
        System.out.println("# engName" + engName);

        String response =
                "{\"" +
                        "korName\":\""+korName+"\"," +
                        "\"engName\":\""+engName+"\"" +
                        "}";
        return response;
    }

    @GetMapping("/{coffee-id}")
    public String getcoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        // not implementation
        return null;
    }
    @GetMapping
    public String getCoffees() {
        System.out.println("# get Coffees");

        return null;
    }
}
