      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Leitura de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       READ-${tabela.name?upper_case}.
<#-- Declara a carga da chave -->
           READ ${tabela.name?upper_case} KEY CHAVE IGNORE LOCK.