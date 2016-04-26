CREATE TABLE Asociado(


    Nombre VARCHAR(20),
    PRIMARY KEY (Nombre)

);



CREATE TABLE Registradora(
        Id INTEGER NOT NULL,
        Id_asociado VARCHAR(20),
        Fecha DATE,
        PRIMARY KEY (Id),
	FOREIGN KEY (Id_asociado) REFERENCES Asociado(nombre)
);

