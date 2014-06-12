       FD ${tabela.name?upper_case} RECORD CONTAINS ${tabela.length} CHARACTERS.
      *>-> Registro de ${tabela.name?lower_case}
       01  REGISTRO.
      *>-> Chave principal
           05 CHAVE.
<#list tabela.columns as column>
<#if column.isKey()>
<#if column.comment??>
      *>-> ${column.comment}
</#if>
              10 ${column.name?upper_case} PIC IS ${column.pic}(${column.lengthInteger})<#if column.lengthDecimal != 0>V9(${column.lengthDecimal})</#if>.
</#if>
</#list>
      *>-> Dados de ${tabela.name?lower_case}
           05 DADOS.
<#list tabela.columns as column>
<#if !column.isKey()>
<#if column.comment??>
      *>-> ${column.comment}
</#if>
              10 ${column.name?upper_case} PIC IS ${column.pic}(${column.lengthInteger})<#if column.lengthDecimal != 0>V9(${column.lengthDecimal})</#if>.
</#if>
</#list>
