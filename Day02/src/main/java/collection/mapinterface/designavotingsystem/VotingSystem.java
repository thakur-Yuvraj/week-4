package collection.mapinterface.designavotingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    //Votes are stored in a HashMap (Candidate -> Votes).
    HashMap<String, Integer> candidates;
//TreeMap is used to display the results in sorted order.
    TreeMap<Integer, String> result;
//LinkedHashMap is used to maintain the order of votes.
    LinkedHashMap<Integer, String> votes;

    VotingSystem() {
        candidates = new HashMap<>();
        result = new TreeMap<>();
        votes = new LinkedHashMap<>();
    }

    public void addCandidate(String name, Integer votes) {
        candidates.put(name, votes);
        result.put(votes, name);
        this.votes.put(votes, name);
    }

    // method to display results
    public void displayResult() {
        for(Map.Entry<Integer, String> candidate : result.entrySet()) {
            System.out.println("Candidate name : "+ candidate.getValue() + " Candidate Votes : "+ candidate.getKey());
        }
    }

    // method to display votes and candidate
    public void displayOrderByVotes() {
        for(Map.Entry<Integer, String> candidate : votes.entrySet()) {
            System.out.println("Candidate name : "+ candidate.getValue() + " Candidate Votes : "+ candidate.getKey());
        }
    }
}
