package Exercicios4;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedBase<Integer> list = new DoublyLinkedBase<>();

        //Exemplo 1: Inserir elementos na lista
        DoublyLinkedBase.Node<Integer> node1 = list.addFirst(10);
        DoublyLinkedBase.Node<Integer> node2 = list.addAfter(node1, 20);
        DoublyLinkedBase.Node<Integer> node3 = list.addAfter(node2, 30);
        DoublyLinkedBase.Node<Integer> node4 = list.addAfter(node3, 40);


        System.out.println("O número de elementos: " + list.size());
        list.printNodeElements();

        //Exemplo 2: Excluir elementos da lista
        list.removeNode(node2);
        System.out.println("Tamanho da lista após exclusão: " + list.size());
        list.printNodeElements();

        //Exemplo 3: Verificar se a lista está vazia
        // Verifica se a lista está vazia
        System.out.println("A lista está vazia? " + list.isEmpty());

        // Exclui todos os nós restantes
        list.removeNode(node1);
        list.removeNode(node3);

        // Verifica novamente se a lista está vazia
        System.out.println("A lista está vazia após excluir todos os nós? " + list.isEmpty());

        //Exemplo 4: Inserir elementos no início e no fim da lista

        // Insere um novo nó no início (após o cabeçalho) 
        DoublyLinkedBase.Node<Integer> firstNode = list.addFirst(30); /*-> mudei para 30 para ficar mais evidente */

        // Insere um novo nó no fim (antes do trailer)
        DoublyLinkedBase.Node<Integer> lastNode = list.addLast(50);

        System.out.println("O número de elementos: " + list.size());
        list.printNodeElements();

    }
}