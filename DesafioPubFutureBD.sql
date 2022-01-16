CREATE TABLE receitas(
valor DOUBLE,
dataRecebimento DATE,
dataRecebimentoEsperado DATE,
descricao VARCHAR(100),
tipoReceita VARCHAR(50)
);

CREATE TABLE despesas(
valor DOUBLE,
dataPagamento DATE,
dataPagamentoEsperado DATE,
tipoDespesa VARCHAR(50)
);

CREATE TABLE contas(
saldo DOUBLE,
tipoConta VARCHAR(50),
instituicaoFinanceira VARCHAR(50)
);

-- Adicionando dados na tabela receitas
INSERT INTO receitas(valor, dataRecebimento, dataRecebimentoEsperado, descricao, tipoReceita)
	VALUES(8.000, '2021-06-10', '2021-06-10', 'salario do mes de junho ','salario');
INSERT INTO receitas(valor, dataRecebimento, dataRecebimentoEsperado, descricao, tipoReceita)
	VALUES(10.000, '2022-01-10', '2022-01-10', 'salario do mes de janeiro ','salario');
INSERT INTO receitas(valor, dataRecebimento, dataRecebimentoEsperado, descricao, tipoReceita)
	VALUES(10.000, '2021-09-10', '2021-09-10', 'salario do mes de setembro ','salario');
INSERT INTO receitas(valor, dataRecebimento, dataRecebimentoEsperado, descricao, tipoReceita)
	VALUES(100.000, '2021-11-10', '2021-11-10', 'Premio TriMania', 'Premiacao');

-- Adicionando dados na tabela despesas
INSERT INTO despesas(valor, dataPagamento, dataPagamentoEsperado, tipoDespesa)
	VALUES(2.000, '2021-08-15', '2021-08-15', 'INSS');
INSERT INTO despesas(valor, dataPagamento, dataPagamentoEsperado, tipoDespesa)
	VALUES(50.000, '2022-01-15', '2022-01-23', 'Carro');
INSERT INTO despesas(valor, dataPagamento, dataPagamentoEsperado, tipoDespesa)
	VALUES(7.000, '2021-12-27', '2021-01-03', 'lazer');
	
-- Adicionando dados na tabela contas
INSERT INTO contas(saldo, tipoConta, instituicaoFinanceira)
	VALUES(65.500, 'carteira', 'Banco Comercial');
INSERT INTO contas(saldo, tipoConta, instituicaoFinanceira)
	VALUES(300.700, 'poupanca', 'Banco de Investimento');
INSERT INTO contas(saldo, tipoConta, instituicaoFinanceira)
	VALUES(55.500, 'conta corrente', 'Banco Comercial');