
CREATE TABLE productlist (
    id bigint NOT NULL,
    price double precision,
    name character varying(255),
    upc integer,
    PRIMARY KEY(id)
);

INSERT INTO productlist VALUES (1, 175.0, 'Penguin-years', 20);
INSERT INTO productlist VALUES (2, 825.0, 'Horseshoe', 5);


