      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Atualização de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       UPDATE-${tabela.name?upper_case}.
           READ ${tabela.name?upper_case} KEY CHAVE IGNORE LOCK.
      *>-> Se não encontrou o registro
           IF NOT FS-${tabela.name?upper_case}-OK
              EXIT                PARAGRAPH,
           END-IF.
           REWRITE ${tabela.name?upper_case}.           