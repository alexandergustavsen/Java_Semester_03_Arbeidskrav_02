CREATE TABLE IF NOT EXISTS Talks (
  idTalks INTEGER DEFAULT 1 NOT NULL,
  Title VARCHAR(45) NOT NULL,
  Description VARCHAR(200) NULL,
  Topic VARCHAR(45) NULL,
  Conference_idConference INT NOT NULL,
  Day_idDay INT NOT NULL,
  PRIMARY KEY (idTalks),
  CONSTRAINT fk_Talks_Conference1 FOREIGN KEY (Conference_idConference)
  REFERENCES Conference (idConference),
  CONSTRAINT fk_Talks_Day1 FOREIGN KEY (Day_idDay)
  REFERENCES day (idDay));