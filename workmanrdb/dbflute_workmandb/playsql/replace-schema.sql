-- https://www.postgresql.jp/document/9.4/html/tutorial-table.html
CREATE TABLE task (
   id BIGSERIAL NOT NULL PRIMARY KEY,
   title VARCHAR(256) NOT NULL,
   deadline TIMESTAMP,
   scheduled TIMESTAMP,
   created_at TIMESTAMP NOT NULL,
   created_by VARCHAR(256) NOT NULL,
   updated_at TIMESTAMP NOT NULL,
   updated_by VARCHAR(256) NOT NULL
);