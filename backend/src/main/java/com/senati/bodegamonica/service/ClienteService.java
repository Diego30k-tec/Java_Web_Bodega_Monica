package com.senati.bodegamonica.service;
import com.senati.bodegamonica.entity.Cliente;
import com.senati.bodegamonica.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui van las validaciones, calculos, etc.
@Service
public class ClienteService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final ClienteRepository clienteRepository;

    //Contructor: Spring inyecta automaticamente el repositorio(las dependencias)
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    //Retorna o recibe la lista de todos los clientes
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    //Elimina el cliente por ID
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    };
}
