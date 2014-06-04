      *>-> File-status do arquivo de ${tabela.name?lower_case}
           05 FS-${tabela.name?upper_case} PIC IS X(02) VALUE IS SPACES.
              88 FS-${tabela.name?upper_case}-OK VALUE IS "00".
