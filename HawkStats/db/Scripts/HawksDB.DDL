CREATE SCHEMA PrdHawksStats;

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
		
CREATE TABLE tbl_Plus_minus
	(game_num char(20) NOT NULL,
	plus_minus_for_against char(01),
	plus_minus_player char(02)
		
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