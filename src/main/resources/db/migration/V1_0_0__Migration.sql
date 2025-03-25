CREATE SEQUENCE product_seq INCREMENT 1 START WITH 1 MINVALUE 1;

CREATE TABLE product
(
    id      BIGINT  NOT NULL,
    version BIGINT  NOT NULL,
    name    VARCHAR NOT NULL,
    PRIMARY KEY (id, version)
);