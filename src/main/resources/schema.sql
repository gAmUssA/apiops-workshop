-- CreateTable
CREATE TABLE Product
(
    id          SERIAL Primary Key,
    name        VARCHAR(255) NOT NULL,
    type        VARCHAR(10)  NOT NULL,
    description TEXT         NOT NULL,
    unique (name)
);

CREATE TABLE Session
(
    id          serial       NOT NULL,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    date        timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
    presenters  JSON         NOT NULL
);
