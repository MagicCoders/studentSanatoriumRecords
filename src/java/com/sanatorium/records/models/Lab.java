package models;

// Lab Model
public class LabModel {
    // Lab report class
    public class Report {
        private String testType;
        private String testResults;

        // Constructor
        public Report(String testType, String testResults) {
            this.testType = testType;
            this.testResults = testResults;
        }

        // Setter and Getter methods for each variable
        public String getTestType() {
            return testType;
        }

        public void setTestType(String testType) {
            this.testType = testType;
        }

        public String getResults() {
            return testResults;
        }

        public void setResults(String testResults) {
            this.testResults = testResults;
        }
    }
}
