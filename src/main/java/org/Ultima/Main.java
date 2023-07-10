package org.Ultima;

import org.Ultima.domain.entities.Cliente;
import org.Ultima.domain.entities.Entrega;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("leo");
        cliente.setEmail("leo@le");
        cliente.setCpf("123456789-00");

       System.out.println(cliente.getLis());

    }
}