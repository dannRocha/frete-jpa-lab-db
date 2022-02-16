package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "funcionario")
@DiscriminatorValue("funcionario")
@Getter
@Setter
public final class Funcionario extends PessoaFisica{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String matricula;

  @OneToMany(mappedBy = "funcionario")
  private Set<Dependente> dependentes;
}
