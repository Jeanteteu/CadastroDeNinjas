package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao Criada com sucesso.";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas com sucesso.";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return  "Missão alterada.";
    }

    @DeleteMapping("deletar")
    public String deletarMissao(){
        return "Missão deletada";
    }


}
