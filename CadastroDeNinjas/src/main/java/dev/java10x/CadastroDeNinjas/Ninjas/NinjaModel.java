package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro") //padrão
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    //@ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Chave estrangeira
    private MissoesModel missoes;


}
