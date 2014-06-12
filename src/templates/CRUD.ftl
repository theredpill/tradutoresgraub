      *>--------------------------------------------------------------------------------------------------------------<*
      *> CRUD do arquivo ${tabela.name?lower_case}
      *>--------------------------------------------------------------------------------------------------------------<*
       IDENTIFICATION             DIVISION.
       PROGRAM-ID.                CRUD.
       AUTHOR.                    Douglas Murillo Pedro.
       INSTALLATION.              Douglas Murillo Pedro.
       ENVIRONMENT                DIVISON.
       CONFIGURATION              SECTION.
       SPECIAL-NAMES.
           DECIMAL-POINT     IS   COMMA,
           CONSOLE           IS   CRT.
       OBJECT                     SECTION.
       CLASS-CONTROL.
       INPUT-OUTPUT               SECTION.
       FILE-CONTROL.
      *>--------------------------------------------------------------------------------------------------------------<*
           COPY                   Select.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
       DATA                       DIVISION.
       FILE                       SECTION.
           COPY                   FD.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
       WORKING-STORAGE            SECTION.
      *>--------------------------------------------------------------------------------------------------------------<*
       01  WRK-CAMPOS.
           COPY                   FileStatus.CPY.
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
           COPY                   Open.CPY.
           COPY                   Create.CPY.
           COPY                   Read.CPY.
           COPY                   Update.CPY.
           COPY                   Delete.CPY.
           COPY                   Close.CPY.
      *>--------------------------------------------------------------------------------------------------------------<*
                                                           