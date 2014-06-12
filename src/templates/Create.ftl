      *>--------------------------------------------------------------------------------------------------------------<*
      *>-> Criação de um registro no arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       CREATE-${tabela.name?upper_case}.
<#list tabela.columns as column>
<#if column.isKey()>
<#if column.pic = "9">
           IF ${column.name?upper_case} IS EQUAL TO ZEROS
              EXIT                PARAGRAPH,
           END-IF.
</#if>
<#if column.pic = "X">
           IF ${column.name?upper_case} IS EQUAL TO SPACES
              EXIT                PARAGRAPH,
           END-IF.
</#if>
</#if>
</#list>
           WRITE ${tabela.name?upper_case}.           