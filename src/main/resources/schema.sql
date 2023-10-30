/*課題4*/
/*
CREATE TABLE users (
    id IDENTITY,
    name VARCHAR NOT NULL
);

CREATE TABLE matches (
    id IDENTITY,
    user1 VARCHAR NOT NULL,
    user2 VARCHAR NOT NULL,
    user1Hand VARCHAR NOT NULL,
    user2Hand VARCHAR NOT NULL
);
*/

/*課題5*/
CREATE TABLE users (
    id IDENTITY,
    name VARCHAR NOT NULL
);

CREATE TABLE matches (
    id IDENTITY,
    user1 VARCHAR NOT NULL,
    user2 VARCHAR NOT NULL,
    user1Hand VARCHAR NOT NULL,
    user2Hand VARCHAR NOT NULL,
    isActive BOOLEAN
);

CREATE TABLE matchinfo (
  id IDENTITY,
  user1 VARCHAR NOT NULL,
  user2 VARCHAR NOT NULL,
  user1Hand VARCHAR NOT NULL,
  isActive BOOLEAN
);
