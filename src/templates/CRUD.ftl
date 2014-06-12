      *>--------------------------------------------------------------------------------------------------------------<*
      *> CRUD do arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       IDENTIFICATION             DIVISION.
       PROGRAM-ID.                CRUD.
<#-- Tem de pegar o início de um programa normal e colocar aqui -->

      *>--------------------------------------------------------------------------------------------------------------<*
           COPY                   SELECT${tabela.name?upper_case}.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
       DATA                       DIVISION.
       FILE                       SECTION.
           COPY                   FD${tabela.name?upper_case}.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
       WORKING-STORAGE            SECTION.
      *>--------------------------------------------------------------------------------------------------------------<*
       01  WRK-CAMPOS.
           COPY                   FILESTATUS${tabela.name?upper_case}.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
       LINKAGE                    SECTION.
      *>--------------------------------------------------------------------------------------------------------------<*
       PROCEDURE                  DIVISION.
       000-INICIO.
           PERFORM                OPEN-${tabela.name?upper_case}.
           PERFORM                CREATE-${tabela.name?upper_case}.
           PERFORM                READ-${tabela.name?upper_case}.
           PERFORM                UPDATE-${tabela.name?upper_case}.
           PERFORM                DELETE-${tabela.name?upper_case}.
           PERFORM                CLOSE-${tabela.name?upper_case}.
           EXIT                   PROGRAM.
      *>--------------------------------------------------------------------------------------------------------------<*
           COPY                   OPEN${tabela.name?upper_case}.CPY.
           COPY                   CREATE${tabela.name?upper_case}.CPY.
           COPY                   READ${tabela.name?upper_case}.CPY.
           COPY                   UPDATE${tabela.name?upper_case}.CPY.
           COPY                   DELETE${tabela.name?upper_case}.CPY.
           COPY                   CLOSE${tabela.name?upper_case}.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
                                                           