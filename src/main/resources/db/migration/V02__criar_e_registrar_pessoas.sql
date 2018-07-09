CREATE SEQUENCE pessoa_id_seq;
CREATE TABLE pessoa (
id BIGINT(20) PRIMARY KEY DEFAULT nextval('pessoa_id_seq') NOT NULL,
nome varchar(100) NOT NULL,
logradouro varchar(100),
numero varchar(10),
complemento varchar(100),
bairro varchar(50),
cep varchar(10),
cidade varchar(50),
estado varchar(50),
ativo boolean NOT NULL
);

INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Paulo Jorge','Rua Getulio Vargas','2544','casa','São Cistovão', '76804060','Porto Velho', 'Rondônia',TRUE);
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Yara Caroline','Rua Eliezer de Carvalho','1234','casa','Igarapé', '76804606','Porto Velho', 'Rondônia',TRUE);
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Gleici','Avenida 7 de setembro','5','apto','Lagoinha', '76943450','Rio Branco', 'Acre',FALSE);