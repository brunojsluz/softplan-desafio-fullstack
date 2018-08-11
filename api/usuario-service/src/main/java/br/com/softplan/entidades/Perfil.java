package br.com.softplan.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "perfil")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "perfil_codigo_seq", sequenceName = "perfil_codigo_seq", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfil_codigo_seq")
    private Integer codigo;

    @Column(name = "nome_perfil")
    private String nomePerfil;

    @Column(name = "descricao_perfil")
    private String descricaoPerfil;

}
