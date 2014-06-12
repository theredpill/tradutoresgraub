      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Leitura de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       READ-${tabela.name?upper_case}.
           READ ${tabela.name?upper_case} KEY CHAVE IGNORE LOCK.