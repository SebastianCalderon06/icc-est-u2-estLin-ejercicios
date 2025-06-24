package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */



    public String invertirCadena(String texto) {
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<String>();
        for(int i = 0; i<texto.length(); i++){
            st.push(texto.charAt(i) + "");
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < expresion.length(); i++) {
        char a = expresion.charAt(i);
        if (a == '{' || a == '[' || a == '(') {
            st.push(a);
        }else if(a == '}' || a == ']' || a == ')') {
            if(st.isEmpty()) {
                return false;
            }
            if(st.peek() == '{' && a == '}'){
                st.pop();
            }else{
            if(st.peek() == '[' && a == ']'){
                st.pop();
            }else{
            if(st.peek() == '(' && a == ')'){
                st.pop();
            }}
        }
        if (st.isEmpty())
            return true;
        }
    
    }
    return false;
}

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */

    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> aux = new Stack<>();

        while (!pila.isEmpty()) {
            int temp = pila.pop();


            while (!aux.isEmpty() && aux.peek() < temp) {
                pila.push(aux.pop());
            }

            aux.push(temp);
        }
        List<Integer> resultado = new ArrayList<>();
        while (!aux.isEmpty()) {
            resultado.add(aux.pop());
        }

        return resultado;
}

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        return new ArrayList<>();
    }
}
