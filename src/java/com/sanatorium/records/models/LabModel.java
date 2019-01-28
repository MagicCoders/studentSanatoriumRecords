package models;

// Lab Model.
public class LabModel {
    // Lab report class.
    public class Report {
        private String testType;

        private String negativeResults;
        private String positiveResults;

        // Constructor.
        public Report(String testType, String negativeResults, String positiveResults) {
            this.testType = testType;
            this.negativeResults = negativeResults;
            this.positiveResults = positiveResults;
        }

        //Setter and Getter methods for eacch variable.

        public String getTestType() {
            return testType;
        }

        public void setTestType(String testType) {
            this.testType = testType;
        }

        public String getPositiveResults() {
            return positiveResults;
        }

        public void setPositiveResults(String positiveResults) {
            this.positiveResults = positiveResults;
        }

        public String getNegativeResults() {
            return negativeResults;
        }

        public void setNegativeResults(String negativeResults) {
            this.negativeResults = negativeResults;
        }
    }
}