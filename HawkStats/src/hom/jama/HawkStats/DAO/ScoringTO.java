package hom.jama.HawkStats.DAO;

import hom.jama.common.db.TransferObject;

public class ScoringTO extends TransferObject {
private String game_num;
private String goal_scorer;
private String goal_assist_1;
private String goal_assist_2;
private String goal_location;
    private String for_against;
    private String goal_type;
    private String goal_on_ice_player_1;
    private String goal_on_ice_player_2;
    private String goal_on_ice_player_3;
    private String goal_on_ice_player_4;
    private String goal_on_ice_player_5;
    private String goal_on_ice_player_6;
    private String shot_type;
    private String scored_goalie;
    private String goal_period;

	protected void reset(String s) {
		// TODO Auto-generated method stub

	}

    public String getgame_num() {
        return game_num;
    }

    public void setgame_num(String game_num) {
        this.game_num = game_num;
    }

    public String getgoal_scorer() {
        return goal_scorer;
    }

    public void setgoal_scorer(String goal_scorer) {
        this.goal_scorer = goal_scorer;
    }

    public String getgoal_assist_1() {
        return goal_assist_1;
    }

    public void setgoal_assist_1(String goal_assist_1) {
        this.goal_assist_1 = goal_assist_1;
    }

    public String getgoal_assist_2() {
        return goal_assist_2;
    }

    public void setgoal_assist_2(String goal_assist_2) {
        this.goal_assist_2 = goal_assist_2;
    }

    public String getgoal_location() {
        return goal_location;
    }

    public void setgoal_location(String goal_location) {
        this.goal_location = goal_location;
    }

    public String getfor_against() {
        return for_against;
    }

    public void setfor_against(String for_against) {
        this.for_against = for_against;
    }

    public String getgoal_type() {
        return goal_type;
    }

    public void setgoal_type(String goal_type) {
        this.goal_type = goal_type;
    }

    public String getgoal_on_ice_player_1() {
        return goal_on_ice_player_1;
    }

    public void setgoal_on_ice_player_1(String goal_on_ice_player_1) {
        this.goal_on_ice_player_1 = goal_on_ice_player_1;
    }

    public String getgoal_on_ice_player_2() {
        return goal_on_ice_player_2;
    }

    public void setgoal_on_ice_player_2(String goal_on_ice_player_2) {
        this.goal_on_ice_player_2 = goal_on_ice_player_2;
    }

    public String getgoal_on_ice_player_3() {
        return goal_on_ice_player_3;
    }

    public void setgoal_on_ice_player_3(String goal_on_ice_player_3) {
        this.goal_on_ice_player_3 = goal_on_ice_player_3;
    }

    public String getgoal_on_ice_player_4() {
        return goal_on_ice_player_4;
    }

    public void setgoal_on_ice_player_4(String goal_on_ice_player_4) {
        this.goal_on_ice_player_4 = goal_on_ice_player_4;
    }

    public String getgoal_on_ice_player_5() {
        return goal_on_ice_player_5;
    }

    public void setgoal_on_ice_player_5(String goal_on_ice_player_5) {
        this.goal_on_ice_player_5 = goal_on_ice_player_5;
    }

    public String getgoal_on_ice_player_6() {
        return goal_on_ice_player_6;
    }

    public void setgoal_on_ice_player_6(String goal_on_ice_player_6) {
        this.goal_on_ice_player_6 = goal_on_ice_player_6;
    }

    public String getshot_type() {
        return shot_type;
    }

    public void setshot_type(String shot_type) {
        this.shot_type = shot_type;
    }

    public String getscored_goalie() {
        return scored_goalie;
    }

    public void setscored_goalie(String scored_goalie) {
        this.scored_goalie = scored_goalie;
    }

    public String getgoal_period() {
        return goal_period;
    }

    public void setgoal_period(String goal_period) {
        this.goal_period = goal_period;
    }

	
}
