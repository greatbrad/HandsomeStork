package hom.jama.HawkStats.DAO;

import hom.jama.common.db.TransferObject;

public class PlayersTO extends TransferObject {

	@Override
	protected void init() {
		// TODO Auto-generated method stub

	}
	//The players jersey number
private String PLAYER_NUM;
// the players position...either F or Defense
private String PLAYER_POSITION;
//the players full name
private String PLAYER_NAME;
/**
 * @return the pLAYER_NUM
 */
public String getPLAYER_NUM() {
	return PLAYER_NUM;
}
/**
 * @param pLAYER_NUM the pLAYER_NUM to set
 */
public void setPLAYER_NUM(String playerNum) {
	PLAYER_NUM = playerNum;
}
/**
 * @return the pLAYER_POSITION
 */
public String getPLAYER_POSITION() {
	return PLAYER_POSITION;
}
/**
 * @param pLAYER_POSITION the pLAYER_POSITION to set
 */
public void setPLAYER_POSITION(String playerPostion) {
	PLAYER_POSITION = playerPostion;
}
/**
 * @return the pLAYER_NAME
 */
public String getPLAYER_NAME() {
	return PLAYER_NAME;
}
/**
 * @param pLAYER_NAME the pLAYER_NAME to set
 */
public void setPLAYER_NAME(String playerName) {
	PLAYER_NAME = playerName;
}
}
