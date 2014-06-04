      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Atualização de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       UPDATE-${tabela.name?upper_case}.
<#-- Declara a carga da chave -->
           READ ${tabela.name?upper_case} KEY CHAVE IGNORE LOCK.
<#-- Altera os dados -->
           REWRITE ${tabela.name?upper_case}.           