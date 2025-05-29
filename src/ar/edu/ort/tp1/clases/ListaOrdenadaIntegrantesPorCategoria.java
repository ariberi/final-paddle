package ar.edu.ort.tp1.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaIntegrantesPorCategoria extends ListaOrdenadaNodos<Categoria, Integrante> {

    /**
     * devuelve 0, un positivo o un negativo
     * 0: si clave del dato1 es igual a clave dato2
     * negativo: si clave del dato1 es menor a clave dato2
     * positivo: si clave del dato1 es mayor a clave dato2
     * ordinal devuelve el indice de la constante como esta declarado en el enum
     * @param dato1
     * @param dato2
     * @return 0, un positivo o un negativo
     */
    @Override
    public int compare(Integrante dato1, Integrante dato2) {
        return dato1.getCategoria().ordinal() - dato2.getCategoria().ordinal();
    }


    @Override
    public int compareByKey(Categoria clave, Integrante elemento) {
        return clave.ordinal() - elemento.getCategoria().ordinal();
    }

}
