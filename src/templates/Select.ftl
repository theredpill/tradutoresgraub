           SELECT  ${tabela.name?upper_case} ASSIGN TO ${tabela.name?upper_case}.DAD,
           ORGANIZATION IS INDEXED, ACCESS MODE IS DYNAMIC, RECORD KEY IS CHAVE,
           LOCK MODE IS MANUAL WITH LOCK ON RECORD, FILE STATUS IS FS-${tabela.name?upper_case}.
                                  