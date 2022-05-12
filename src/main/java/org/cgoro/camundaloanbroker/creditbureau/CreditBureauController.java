package org.cgoro.camundaloanbroker.creditbureau;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@RestController
public class CreditBureauController {

    @PostMapping("/credit")
    public CreditScore getCreditScore(@RequestBody CreditScoreRequest creditScoreRequest) throws NoSuchAlgorithmException {
        int min = 100;
        int max = 900;
        Random r = SecureRandom.getInstanceStrong();

        return  new CreditScore(
                creditScoreRequest.getTaxNumber(),
                r.nextInt(max - min) + min,
                r.nextInt(9) + 1
                );
    }

}
