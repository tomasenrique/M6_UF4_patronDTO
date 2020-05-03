package patronDTO.BO;

import patronDTO.VO.ClienteVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase servira para poner la logica de negocio, es la que se encarga de obtener los datos desde la base de datos
 * y llenar la clase Value Object (ClienteVO) y enviarla al cliente, o a su vez recibir la clase desde el cliente y
 * enviar los datos al servidor, por lo general tiene todos los métodos CRUD (create, read, update y delete).
 */
public class ClienteBO {

    //lista de tipo cliente
   private List<ClienteVO> clientes;


    //constructor, se guarda en la lista 2 clientes
    public ClienteBO() {
        clientes = new ArrayList<>();
        ClienteVO cliente1 = new ClienteVO(0, "Elivar", "Largo");
        ClienteVO cliente2 = new ClienteVO(1, "Priscila", "Morocho");
        clientes.add(cliente1);
        clientes.add(cliente2);
    }

    //elimina el cliente que se le pasa como paraámetro
    public void eliminarCliente(ClienteVO cliente) {
        clientes.remove(cliente.getId());
        System.out.println("Cliente " + cliente.getId() + " eliminado satisfactoriamente");
    }

    //obtiene toda la lista de clientes
    public List<ClienteVO> obtenerClientes() {
        return clientes;
    }

    //obtiene un cliente de acuerdo al id pasado como parámetro
    public ClienteVO obtenerCliente(int id) {
        return clientes.get(id);
    }

    // actualiza el cliente que se le pasa como parámetro
    public void actualizarCliente(ClienteVO cliente) {
        clientes.get(cliente.getId()).setNombre(cliente.getNombre());
        clientes.get(cliente.getId()).setApellido(cliente.getApellido());
        System.out.println("Cliente id: " + cliente.getId() + " actualizado satisfactoriamente");
    }
}
