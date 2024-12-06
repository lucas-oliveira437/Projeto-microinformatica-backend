CREATE EXTENSION IF NOT EXISTS "pgcrypto";


CREATE TABLE cadastro (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome_completo VARCHAR(100) NOT NULL,
    nome_social VARCHAR(100),
    data_nascimento DATE NOT NULL,
    genero VARCHAR(30) NOT NULL,
    email VARCHAR(40) NOT NULL,
    senha VARCHAR(40) NOT NULL,
    cep VARCHAR(8) NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(6) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    estado VARCHAR(40) NOT NULL,
    interesse VARCHAR(50) NOT NULL
);