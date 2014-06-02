<#-- Tem de pegar o início de um programa normal e colocar aqui -->

       COPY                       SELECT${tabela.name?upper_case}.CPY.
       COPY                       FILESTATUS${tabela.name?upper_case}.CPY.
       COPY                       FD${tabela.name?upper_case}.CPY.
       
<#-- Declara os copys gerados aqui -->
            PERFORM               OPEN-${tabela.name?upper_case}.
            PERFORM               CREATE-${tabela.name?upper_case}.
            PERFORM               READ-${tabela.name?upper_case}.
            PERFORM               UPDATE-${tabela.name?upper_case}.
            PERFORM               DELETE-${tabela.name?upper_case}.
            PERFORM               CLOSE-${tabela.name?upper_case}.
            EXIT                  PROGRAM.
<#-- Declara os copys gerados aqui -->

       COPY                       OPEN${tabela.name?upper_case}.CPY.
       COPY                       CREATE${tabela.name?upper_case}.CPY.
       COPY                       READ${tabela.name?upper_case}.CPY.
       COPY                       UPDATE${tabela.name?upper_case}.CPY.
       COPY                       DELETE${tabela.name?upper_case}.CPY.
       COPY                       CLOSE${tabela.name?upper_case}.CPY.
                                                           