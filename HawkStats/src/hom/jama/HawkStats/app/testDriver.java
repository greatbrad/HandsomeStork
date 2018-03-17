package hom.jama.HawkStats.app;
import hom.jama.HawkStats.DAO.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class testDriver {
    private static final Logger hawkLog = LogManager.getRootLogger();
    PlayersTO[] retPlayers;
    PlayersTO retPlayer;
    HawksDatabase thisDB;
	testDriver(){
          hawkLog.trace("instatiating database");
          thisDB = new HawksDatabase();  
        }
    public void runTest(){
        retPlayers = thisDB.getAllPlayers();
        retPlayer = thisDB.getPlayer("97");
            
    hawkLog.trace("exiting application");
}

public static void main(String[] args) {
    testDriver td = new testDriver();
            td.runTest();
	}
}
 
