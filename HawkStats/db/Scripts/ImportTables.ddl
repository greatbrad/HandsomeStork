CREATE TABLE DEVHAWKSTATS.tbl_Scoring_Import
	(game_num char(20) NOT NULL,
	goal_scorer char (2) NOT NULL,
	goal_assist_1 char(02),
	goal_assist_2 char(02),
	goal_location char(02),
	scoring_for_against char(01),
	goal_type char(02),
	goal_onice_player_1 char(02),
	goal_onice_player_2 char(02),
	goal_onice_player_3 char(02),
	goal_onice_player_4 char(02),
	goal_onice_player_5 char(02),
	goal_onice_player_6 char(02),
	shot_type char(03),
	scored_goalie char(02),
	goal_period char(01));


CREATE TABLE DEVHAWKSTATS.tbl_Reference_Import
	(reference_type char(08) NOT NULL,
		reference_key char(10),
	reference_value char(100));

CREATE TABLE DEVHAWKSTATS.tbl_Shots_Import
	(game_num char(20) NOT NULL,
	shots_for_against char(01),
	first_period_shots int,
	second_period_shots int,
	third_period_shots int,
	overtime_shots int,
	shots_goalie char(2),
	shots_goalie_minutes int);

CREATE TABLE DEVHAWKSTATS.tbl_Game_Positions_Import
	(game_player_num char(02),
	game_num char(20) NOT NULL,
	game_player_postion char(03)
	);

CREATE TABLE DEVHAWKSTATS.tbl_Penalty_Import
	(game_num char(20) NOT NULL,
	penalty_for_against char(01),
	penalty_player char(2),
	penalty_infraction char(4),
	penalty_period char(1),
	penalty_minutes char(02));

CREATE TABLE DEVHAWKSTATS.tbl_Players_Import
	(player_position char(02),
		player_jersey_num char(02),
		player_name char(100));
CREATE TABLE DEVHAWKSTATS.tbl_Opponents_Import
	(opponent_name CHAR(20),
		opponent_regular Boolean,
		opponent_tourney Boolean,
		opponent_exhibition Boolean,
		opponent_playoff Boolean);

INSERT INTO TBL_PLAYERS (
player_jersey,
player_roster_type,
player_type,
player_name)
SELECT player_jersey_num,
roster_type,
player_position,
Player_name
FROM tbl_players_import;