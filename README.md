# PARCIAL
## Nombres:
### -John Steban Morales Ceron
### -Carlos Alberto Obando Torrente
```mermaid
classDiagram
    class Libro {
        - String titulo
        - String autor
        - int ejemplares
        - int prestados
        + Libro()
        + Libro(String, String, int, int)
        + String getTitulo()
        + void setTitulo(String)
        + String getAutor()
        + void setAutor(String)
        + int getEjemplares()
        + void setEjemplares(int)
        + int getPrestados()
        + void setPrestados(int)
        + boolean prestamo()
        + boolean devolucion()
        + String toString()
    }

    class LibroTexto {
        - String curso
        + LibroTexto(String, String, int, int, String)
        + String toString()
    }

    class LibroTextoUNIAC {
        - String facultad
        + LibroTextoUNIAC(String, String, int, int, String, String)
        + String toString()
    }

    class Novela {
        - String tipo
        + Novela(String, String, int, int, String)
        + String toString()
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAC
    Libro <|-- Novela
