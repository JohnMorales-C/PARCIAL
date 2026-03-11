# PARCIAL
## Nombres:
### -John Steban Morales Ceron
### -Carlos Alberto Obando Torrente

# Situacion 1:
### Si la clase Libro fuera declarada como final
### public final class Libro { }
### ninguna clase podría heredar de ella.

# Situacion 2:
### Si los atributos fueran private y no existieran
### metodos getter o setter para acceder a ellos,
### las subclases no podrian usarlos directamente.

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



