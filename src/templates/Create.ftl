      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Cria��o de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       CREATE-${tabela.name?upper_case}.
<#-- Carrega os dados -->
           WRITE ${tabela.name?upper_case}.           