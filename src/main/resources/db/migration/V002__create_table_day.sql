CREATE TABLE IF NOT EXISTS Day (
  idDay INTEGER DEFAULT 1 NOT NULL,
  Date INT NULL,
  Time INT NULL,
  Room VARCHAR(45) NULL,
  Conference_idConference INT NOT NULL,
  PRIMARY KEY (idDay),
  CONSTRAINT fk_Day_Conference_idx FOREIGN KEY (Conference_idConference)
  REFERENCES conference(idConference));