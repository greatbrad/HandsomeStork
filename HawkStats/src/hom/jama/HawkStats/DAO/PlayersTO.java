package hom.jama.HawkStats.DAO;

import hom.jama.common.db.TransferObject;

public class PlayersTO extends TransferObject {

    //The players jersey number
    private String player_jersey;
// the players position...either F or Defense
    private String player_type;
// whether the player is rostered or is an AP
    private String player_roster_type;
//the players full name
    private String player_name;

    public void reset(String s) {
        player_jersey = null;
// the players position...either F or Defense
        player_type = null;
// whether the player is rostered or is an AP
        player_roster_type = null;
//the players full name
        player_name = null;

    }

    /**
     * @return the pLAYER_NUM
     */
    public String getplayer_jersey() {
        return player_jersey;
    }

    /**
     * @param pLAYER_NUM the pLAYER_NUM to set
     */
    public void setplayer_jersey(String playerNum) {
        this.player_jersey = playerNum;
    }

    /**
     * @return the pLAYER_POSITION
     */
    public String getplayer_type() {
        return player_type;
    }

    /**
     * @param pLAYER_POSITION the pLAYER_POSITION to set
     */
    public void setplayer_type(String inPlayerType) {
        this.player_type = inPlayerType;
    }

    /**
     * @return the player_name
     */
    public String getplayer_name() {
        return player_name;
    }

    /**
     * @param player_name the player_name to set
     */
    public void setplayer_name(String inPlayerName) {
        this.player_name = inPlayerName;
    }

    public String getplayer_roster_type() {
        return player_roster_type;
    }

    public void setplayer_roster_type(String inPlayer_roster_type) {
        this.player_roster_type = inPlayer_roster_type;
    }
}
