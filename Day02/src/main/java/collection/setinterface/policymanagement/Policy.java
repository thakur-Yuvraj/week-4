package collection.setinterface.policymanagement;

// policy class
public class Policy implements Comparable<Policy>{
    //attributes
    private int policyNumber;
    private String policyholderName;
    private int expiryDate;
    private String coverageType;
    private int premiumAmount;

    public Policy(int policyNumber, String policyholderName, int expiryDate, String coverageType, int premiumAmount) {
        this.coverageType = coverageType;
        this.expiryDate = expiryDate;
        this.policyholderName = policyholderName;
        this.policyNumber = policyNumber;
        this.premiumAmount = premiumAmount;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }


    @Override
    public int compareTo(Policy o) {
        return this.expiryDate - o.expiryDate;
    }

    @Override
    public String toString() {
        return "\nPolicy number : "+ policyNumber +"  Policy holder name : "+ policyholderName +"  expiryDate : "+ expiryDate +"  coverageType : "+ coverageType +"  Premium Amount : " + premiumAmount ;
    }
}
