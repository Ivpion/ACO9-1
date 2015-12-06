package ua.artcode.week5.day1.test;

/**
 * Created by serhii on 05.12.15.
 */
public class TestResult {

    private String testName;

    private String expected;
    private String actual;
    private boolean passed;

    public TestResult(String testName, String expected,
                      String actual) {
        this.testName = testName;
        this.expected = expected;
        this.actual = actual;

        this.passed = expected.equals(actual);
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "testName='" + testName + '\'' +
                ", expected='" + expected + '\'' +
                ", actual='" + actual + '\'' +
                ", passed=" + passed +
                '}';
    }
}
