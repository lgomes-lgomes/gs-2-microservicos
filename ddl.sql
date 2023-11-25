
CREATE TABLE indicador (
    id_indicador VARCHAR2(10 CHAR) NOT NULL,
    descricao    VARCHAR2(255 CHAR) NOT NULL,
    label        VARCHAR2(20 CHAR) NOT NULL,
    id_objetivo  VARCHAR2(10 CHAR) NOT NULL
);

ALTER TABLE indicador ADD CONSTRAINT indicador_pk PRIMARY KEY ( id_indicador );

CREATE TABLE indicador_dados (
    id_indicador VARCHAR2(10 CHAR) NOT NULL,
    ano          NUMBER(4) NOT NULL,
    regiao       VARCHAR2(50 CHAR) NOT NULL,
    valor        NUMBER(5, 2) NOT NULL
);

ALTER TABLE indicador_dados
    ADD CONSTRAINT indicador_dados_pk PRIMARY KEY ( ano,
                                                    regiao,
                                                    id_indicador );

CREATE TABLE objetivo (
    id_objetivo     VARCHAR2(10 CHAR) NOT NULL,
    objetivo_global VARCHAR2(255 CHAR) NOT NULL,
    objetivo_brasil VARCHAR2(255 CHAR) NOT NULL
);

ALTER TABLE objetivo ADD CONSTRAINT objetivos_pk PRIMARY KEY ( id_objetivo );

ALTER TABLE indicador_dados
    ADD CONSTRAINT indicador_dados_indicador_fk FOREIGN KEY ( id_indicador )
        REFERENCES indicador ( id_indicador );

ALTER TABLE indicador
    ADD CONSTRAINT indicador_objetivo_fk FOREIGN KEY ( id_objetivo )
        REFERENCES objetivo ( id_objetivo );

