-- CREATE SCHEMA PrdHawksStats;

Drop Table tbl_Scoring;
CREATE TABLE tbl_Scoring
	(game_num char(20) NOT NULL,
	goal_scorer char (2) NOT NULL,
	goal_assist_1 char(02),
	goal_assist_2 char(020),
	goal_location char(02),
	scoring_for_against char(01),
	goal_type char(02),
	GOAL_ONICE_PLAYER_1 char(02),
	GOAL_ONICE_PLAYER_2 char(02),
	GOAL_ONICE_PLAYER_3 char(02),
	GOAL_ONICE_PLAYER_4 char(02),
	GOAL_ONICE_PLAYER_5 char(02),
	GOAL_ONICE_PLAYER_6 char(02),
	shot_type char(03),
	scored_goalie char(02),
	goal_period char(01));

CREATE INDEX idx_Scoring_gameNum
		on tbl_Scoring(game_num);

drop table 	tbl_Reference;
CREATE TABLE tbl_Reference
	(reference_type char(20) NOT NULL,
	reference_value varchar(100));
Create index idx_reference_reference_type on
	tbl_Reference(reference_type);	

drop table 	tbl_Shots;		
CREATE TABLE tbl_Shots
	(game_num char(20) NOT NULL,
	shots_for_against char(01),
	first_period_shots int,
	second_period_shots int,
	third_period_shots int,
	overtime_shots int,
	shots_goalie char(2),
	shots_goalie_minutes int);

CREATE INDEX idx_Shots_gameNum
	on tbl_Shots(game_num);
	
drop table tbl_Game_Positions;
CREATE TABLE tbl_Game_Positions
	(game_num char(20) NOT NULL,
	game_player_num char(2),
	game_player_position char(3)
	);
	
CREATE INDEX idx_game_position_game_num
	on tbl_Game_Positions(game_num);
	
drop table tbl_Penalty;
CREATE TABLE tbl_Penalty
	(game_num char(20) NOT NULL,
	penalty_for_against char(01),
	penalty_player char(2),
	penalty_infraction char(4),
	penalty_period char(1),
	penalty_minutes int);

CREATE INDEX idx_Penalty_gameNum
	on tbl_Penalty(game_num);

CREATE TABLE TBL_PLAYERS
	(player_jersey char(02),
		player_roster_type char(02),
		player_type char(01),
		player_name varchar (100));
CREATE INDEX idx_player_jersey
	on TBL_PLAYERS(player_jersey);