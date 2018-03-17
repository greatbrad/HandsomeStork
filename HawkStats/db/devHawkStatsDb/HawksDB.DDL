' CREATE SCHEMA PrdHawksStats;

CREATE TABLE tbl_Scoring
	(game_num char(20) NOT NULL,
	goal_scorer char (2) NOT NULL
	goal_assist_1 char(02),
	goal_assist_2 char(020),
	goal_location char(02),
	scoring_for_against char(01),
	goal_type char(02),
	shot_type char(03),
	scored_goalie char(02));

CREATE INDEX idx_Scoring_gameNum
		on tbl_Scoring(game_num);
		
CREATE TABLE tbl_Reference
	(reference_type char(20) NOT NULL,
	reference_value varchar(100));
Create index idx_reference_reference_type on
	tbl_Reference(reference_type);	
		
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
	
CREATE TABLE tbl_Game_Postions
	(game_num char(20) NOT NULL,
	game_player_num char(2),
	game_player_postion char(3)
	);
CREATE INDEX idx_game_position_game_num
	on tbl_Game_positions(game_num);
	
CREATE TABLE tbl_Penalty
	(game_num char(20) NOT NULL,
	penalty_for_against char(01),
	penalty_player char(2),
	penalty_infraction char(4),
	penalty_period char(1),
	penalty_minutes int);

CREATE INDEX idx_Penalty_gameNum
	on tbl_Penalty(game_num);