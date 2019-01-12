SELECT
    cd_produto,
    nm_produto,
    dt_validade,
    vl_produto
FROM
    t_produto;
    
    
INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)
    VALUES (SQ_T_PRODUTO.NEXTVAL, 'Uva', 12.80, TO_DATE('28/12/2018', 'DD/MM/YYYY'));

UPDATE t_produto
SET
    a = b
WHERE
    cd_produto =:v0
    AND nm_produto =:v1
    AND dt_validade =:v2
    AND vl_produto =:v3;
    
22, 23, 24, 25, 26
    
DELETE FROM t_produto
WHERE
    cd_produto = 26;