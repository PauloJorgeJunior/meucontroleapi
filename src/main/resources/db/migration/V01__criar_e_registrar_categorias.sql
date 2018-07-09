CREATE SEQUENCE categoria_id_seq;
CREATE TABLE categoria (
  id BIGINT(20) PRIMARY KEY DEFAULT nextval('categoria_id_seq') NOT NULL,
  nome varchar(50) NOT NULL
);

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Farmácia');
INSERT INTO categoria (nome) values ('Outros');