CREATE DATABASE jaegers;

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY NOT NULL,
    modelName TEXT,
    mark TEXT,
    height INTEGER NOT NULL,
    weight INTEGER NOT NULL,
    status TEXT,
    origin TEXT,
    launch TEXT,
    kaijuKill INTEGER NOT NULL
);

\i init_db.sql;
\i queries.sql;

DROP TABLE jaegers;
DROP DATABASE jaegers;
