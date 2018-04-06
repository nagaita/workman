-- https://www.postgresql.jp/document/9.4/html/tutorial-table.html

CREATE TABLE task_status (
  code CHAR(16) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  description VARCHAR(256),
  display_order INTEGER NOT NULL
);
CREATE UNIQUE INDEX ix_task_status_code ON task_status(code);

CREATE TABLE task (
   id BIGSERIAL PRIMARY KEY,
   title VARCHAR(256) NOT NULL,
   status CHAR(16) REFERENCES task_status(code) NOT NULL,
   deadline TIMESTAMP,
   scheduled TIMESTAMP,
   created_at TIMESTAMP NOT NULL,
   created_by VARCHAR(256) NOT NULL,
   updated_at TIMESTAMP NOT NULL,
   updated_by VARCHAR(256) NOT NULL
);