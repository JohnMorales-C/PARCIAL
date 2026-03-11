# PARCIAL
## Nombres:
### -John Steban Morales Ceron
### -Carlos Alberto Obando Torrente

classDiagram
    class Libro {
        -titulo: String
        -autor: String
        -ejemplares: int
        -prestados: int
        +getTitulo(): String
        +setTitulo(titulo: String): void
        +getAutor(): String
        +setAutor(autor: String): void
        +getEjemplares(): int
        +setEjemplares(ejemplares: int): void
        +getPrestados(): int
        +setPrestados(prestados: int): void
        +prestamo(): boolean
        +devolucion(): boolean
        +toString(): String
    }
    class LibroTexto {
        -curso: String
        +toString(): String
    }
    class LibroTextoUNIAC {
        -facultad: String
        +toString(): String
    }
    class Novela {
        -tipo: String
        +toString(): String
    }
    Libro <|-- LibroTexto : extends
    LibroTexto <|-- LibroTextoUNIAC : extends
    Libro <|-- Novela : extends
