//Design a Voting System
//Description: Design a system where:
//Votes are stored in a HashMap (Candidate -> Votes).
//TreeMap is used to display the results in sorted order.
//LinkedHashMap is used to maintain the order of votes.


package collection.mapinterface.designavotingsystem;


public class Main {
    public static void main(String[] args) {
        // creating object of voting system
        VotingSystem votingSystem = new VotingSystem();

        // adding candidates along with their votes
        votingSystem.addCandidate("abc", 945);
        votingSystem.addCandidate("xyz", 9450);
        votingSystem.addCandidate("pqr", 45);
        votingSystem.addCandidate("vijay", 95);

        // printing the order of votes
        System.out.println("Order of votes :-");
        votingSystem.displayOrderByVotes();

        // displaying the result
        System.out.println("Result :-");
        votingSystem.displayResult();
    }
}
