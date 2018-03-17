package hom.jama.HawkStats.DAO;

import hom.jama.common.db.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class HawksDatabase extends Database {

    public HawksDatabase() {
        super("HawksDB.properties");
    }

    public PlayersTO getPlayer(String jerseyNum) {
        PlayersTO To = new PlayersTO();
        logger.debug("entering get player.  Jersey num: " + jerseyNum);
        
        try {
            logger.debug("Getting preparedStatement");
            PreparedStatement ps = getPreparedStatement("getPlayerByJersey");
            logger.debug("Setting jerseyNumber parameter to " + jerseyNum);
            ps.setString(1, jerseyNum);
            logger.debug("Executing query");
            ResultSet rs = ps.executeQuery();
            logger.debug("Mapping PlayerTO Object");
            //*To = mapPlayerTOFromResultSet(rs);
            ArrayList returnedTO = mapTransferObject(rs);
            To = (PlayersTO) returnedTO.get(0);

        } catch (SQLException ex) {
            handleSQLException("GetPlayer failed", ex);
        }         
        return To;
    }
public PlayersTO[] getAllPlayers() {
        ArrayList returnedTOs = null;
        logger.debug("entering get all players.");
        
        try {
            logger.debug("Getting preparedStatement");
            PreparedStatement ps = getPreparedStatement("getAllPlayers");
            logger.debug("Executing query");
            ResultSet rs = ps.executeQuery();
            logger.debug("Mapping PlayerTO Object");
            //*To = mapPlayerTOFromResultSet(rs);
            returnedTOs = mapTransferObject(rs);

        } catch (SQLException ex) {
            handleSQLException("GetPlayer failed", ex);
        }  
        Iterator it = returnedTOs.iterator();
        int toCnt = 0;
        PlayersTO[] ToArray= new PlayersTO[returnedTOs.size()];
        while(it.hasNext()){
            ToArray[toCnt++] = (PlayersTO) it.next();
        }
        

        return ToArray;
    }
}
