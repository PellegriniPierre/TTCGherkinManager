package utils;

import io.cucumber.java.Scenario;

public class ScenarioContext {
    private Scenario scenario;
    public Scenario getScenario() {
        return scenario;
    }
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
}
