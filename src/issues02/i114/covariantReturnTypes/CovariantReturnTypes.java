package issues02.i114.covariantReturnTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovariantReturnTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            case "Karnataka":
                region = new Karnataka();
                break;
        }
        assert region != null;
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower {
    public String whatsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    public String whatsYourName() {
        return "Lotus";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}

class Karnataka extends Region {
    @Override
    public Lotus yourNationalFlower() {
        return new Lotus();
    }
}


/*
https://www.hackerrank.com/challenges/java-covariance/problem
 */