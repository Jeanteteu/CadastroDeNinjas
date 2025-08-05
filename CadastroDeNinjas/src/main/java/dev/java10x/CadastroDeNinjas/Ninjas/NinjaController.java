package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os Ninja";
    }

    //Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por ID";

    }

    //Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarTodosOsNinjasPorId(){
        return "Alterar Ninja por ID";

    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Detelar Ninja por ID";
    }

}
