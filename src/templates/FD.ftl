       FD          ${tabela.name?upper_case}         RECORD CONTAINS <#-- ${tabela.lenght} --> CHARACTERS.
      *>-> Registro de ${tabela.name?lower_case}
       01  REGISTRO.
      *>-> Chave principal
           05 CHAVE.
<#list tabela.columns as column>
<#if column.isKey()>
<#-- Aqui deve testar se tem comentário e imprimir ele -->
<#-- Aqui deve testar o tipo da coluna e criar um campo com a PIC certa -->
              10 ${column.name?upper_case}           PIC IS ${column.dataType}.
</#if>
</#list>
      *>-> Dados de ${tabela.name?lower_case}
           05 DADOS.
<#list tabela.columns as column>
<#if !column.isKey()>
<#-- Aqui deve testar se tem comentário e imprimir ele -->
<#-- Aqui deve testar o tipo da coluna e criar um campo com a PIC certa -->
              10 ${column.name?upper_case}           PIC IS ${column.dataType}.
</#if>
</#list>
