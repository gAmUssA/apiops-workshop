CREATE TABLE Product
(
    id          INTEGER      NOT NULL AUTO_INCREMENT,
    name        VARCHAR(255) NOT NULL,
    type        VARCHAR(10)  NOT NULL,
    description TEXT         NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Session
(
    id          INTEGER      NOT NULL AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    date        DATETIME(3)  NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
    presenters  JSON         NOT NULL,
    PRIMARY KEY (id)
);
