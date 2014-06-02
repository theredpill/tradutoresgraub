      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Exclusão de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       DELETE-${tabela.name?upper_case}.
<#-- Declara a carga da chave -->
           DELETE ${tabela.name?upper_case}.