package uom.team2.weball_statistics.Model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class TeamLiveStatistics implements firebaseModel {

    private int match_id;
    private int team_id;
    private int successful_effort;
    private int total_effort;
    private int successful_freethrow;
    private int total_freethrow;
    private int succesful_twopointer;
    private int total_twopointer;
    private int succesful_threepointer;
    private int total_threepointer;
    private int steal;
    private int assist;
    private int block;
    private int rebound;
    private int foul;
    private int turnover;


    public TeamLiveStatistics() {

    }

    public TeamLiveStatistics(int matchId, int teamId, int successfulEffort, int totalEffort, int successfulFreethrow, int totalFreethrow, int succesful_twopointer, int totalTwopointer, int succesfulThreepointer, int totalThreepointer, int steal, int assist, int block, int rebound, int foul, int turnover) {
        this.match_id = matchId;
        this.team_id = teamId;
        this.successful_effort = successfulEffort;
        this.total_effort = totalEffort;
        this.successful_freethrow = successfulFreethrow;
        this.total_freethrow = totalFreethrow;
        this.succesful_twopointer = succesful_twopointer;
        this.total_twopointer = totalTwopointer;
        this.succesful_threepointer = succesfulThreepointer;
        this.total_threepointer = totalThreepointer;
        this.steal = steal;
        this.assist = assist;
        this.block = block;
        this.rebound = rebound;
        this.foul = foul;
        this.turnover = turnover;
    }

    @Override
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("match_id", match_id);
        result.put("team_id", team_id);
        result.put("successful_effort", successful_effort);
        result.put("total_effort", total_effort);
        result.put("successful_freethrow", successful_freethrow);
        result.put("total_freethrow", total_freethrow);
        result.put("succesful_twopointer", succesful_twopointer);
        result.put("total_twopointer", total_twopointer);
        result.put("succesful_threepointer", succesful_threepointer);
        result.put("total_threepointer", total_threepointer);
        result.put("steal", steal);
        result.put("assist", assist);
        result.put("block", block);
        result.put("rebound", rebound);
        result.put("foul", foul);
        result.put("turnover", turnover);
        return result;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getSuccessful_effort() {
        return successful_effort;
    }

    public void setSuccessful_effort(int successful_effort) {
        this.successful_effort = successful_effort;
    }

    public int getTotal_effort() {
        return total_effort;
    }

    public void setTotal_effort(int total_effort) {
        this.total_effort = total_effort;
    }

    public int getSuccessful_freethrow() {
        return successful_freethrow;
    }

    public void setSuccessful_freethrow(int successful_freethrow) {
        this.successful_freethrow = successful_freethrow;
    }

    public int getTotal_freethrow() {
        return total_freethrow;
    }

    public void setTotal_freethrow(int total_freethrow) {
        this.total_freethrow = total_freethrow;
    }

    public int getSuccesful_twopointer() {
        return succesful_twopointer;
    }

    public void setSuccesful_twopointer(int succesful_twopointer) {
        this.succesful_twopointer = succesful_twopointer;
    }

    public int getTotal_twopointer() {
        return total_twopointer;
    }

    public void setTotal_twopointer(int total_twopointer) {
        this.total_twopointer = total_twopointer;
    }

    public int getSuccesful_threepointer() {
        return succesful_threepointer;
    }

    public void setSuccesful_threepointer(int succesful_threepointer) {
        this.succesful_threepointer = succesful_threepointer;
    }

    public int getTotal_threepointer() {
        return total_threepointer;
    }

    public void setTotal_threepointer(int total_threepointer) {
        this.total_threepointer = total_threepointer;
    }

    public int getSteal() {
        return steal;
    }

    public void setSteal(int steal) {
        this.steal = steal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        this.rebound = rebound;
    }

    public int getFoul() {
        return foul;
    }

    public void setFoul(int foul) {
        this.foul = foul;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }
}
