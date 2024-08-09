create table USER(
    ID                 BIGINT           NOT NULL,
    NAME               CHARACTER        VARYING(500) NOT NULL,
    DATE_OF_BIRTH      date             NOT NULL,
    PASSWORD           CHARACTER        VARYING(500) NOT NULL,

    CONSTRAINT USER_PKEY PRIMARY KEY (ID)
);

create table ACCOUNT(
    ID                 BIGINT           NOT NULL,
    USER_ID            BIGINT           NOT NULL UNIQUE,
    BALANCE            DECIMAL,

    CONSTRAINT FK_ACCOUNT_TO_USER FOREIGN KEY (USER_ID) REFERENCES USER (ID),
    CONSTRAINT ACCOUNT_PKEY PRIMARY KEY (ID)
);

CREATE TABLE EMAIL_DATA(
    ID                 BIGINT           NOT NULL,
    USER_ID            BIGINT           NOT NULL,
    EMAIL              CHARACTER        VARYING(200) NOT NULL UNIQUE,

    CONSTRAINT FK_EMAIL_DATA_TO_USER FOREIGN KEY (USER_ID) REFERENCES USER (ID),
    CONSTRAINT EMAIL_DATA_PKEY PRIMARY KEY (ID)
);

create table PHONE_DATA(
    ID                 BIGINT           NOT NULL,
    USER_ID            BIGINT           NOT NULL,
    PHONE              CHARACTER        VARYING(13) NOT NULL UNIQUE,

    CONSTRAINT FK_PHONE_DATA_TO_USER FOREIGN KEY (USER_ID) REFERENCES USER (ID),
    CONSTRAINT PHONE_DATA_PKEY PRIMARY KEY (ID)
);

CREATE SEQUENCE USER_SEQUENCE
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE ACCOUNT_SEQUENCE
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE EMAIL_DATA_SEQUENCE
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE PHONE_DATA_SEQUENCE
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE UNIQUE INDEX ACCOUNT_USER_ID_IDX ON ACCOUNT(USER_ID);
CREATE INDEX EMAIL_DATA_USER_ID_IDX ON EMAIL_DATA(USER_ID);
CREATE UNIQUE INDEX EMAIL_DATA_EMAIL_IDX ON EMAIL_DATA(EMAIL);
CREATE INDEX PHONE_DATA_USER_ID_IDX ON PHONE_DATA(USER_ID);
CREATE UNIQUE INDEX PHONE_DATA_PHONE_IDX ON PHONE_DATA(PHONE);

INSERT INTO USER (1, 'User One', 1.07.1991, '12345678');
INSERT INTO USER (2, 'User Two', 11.09.1992, '12345678');
INSERT INTO USER (3, 'User Three', 21.01.1993, '12345678');
INSERT INTO USER (4, 'User Four', 12.05.1994, '12345678');
INSERT INTO USER (5, 'User Five', 15.11.1995, '12345678');

INSERT INTO ACCOUNT(1, 1, 100);
INSERT INTO ACCOUNT(2, 2, 200);
INSERT INTO ACCOUNT(3, 3, 300);
INSERT INTO ACCOUNT(4, 4, 400);
INSERT INTO ACCOUNT(5, 5, 500);

INSERT INTO EMAIL_DATA(1, 1, 'user1@mail.ru');
INSERT INTO EMAIL_DATA(2, 2, 'user2@mail.ru');
INSERT INTO EMAIL_DATA(3, 3, 'user3@mail.ru');
INSERT INTO EMAIL_DATA(4, 4, 'user4@mail.ru');
INSERT INTO EMAIL_DATA(5, 5, 'user5_1@mail.ru');
INSERT INTO EMAIL_DATA(6, 5, 'user5_2@mail.ru');

INSERT INTO PHONE_DATA(1, 1, '79998887711');
INSERT INTO PHONE_DATA(2, 2, '79998887722');
INSERT INTO PHONE_DATA(3, 3, '79998887733');
INSERT INTO PHONE_DATA(4, 4, '79998887744');
INSERT INTO PHONE_DATA(5, 4, '79998887755');
INSERT INTO PHONE_DATA(5, 5, '79998887766');

