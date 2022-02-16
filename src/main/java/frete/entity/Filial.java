package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "filial")
@Getter
@Setter
public class Filial {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String endereco;
  private String telefone;

  @OneToMany(mappedBy = "filial")
  private Set<Veiculo> veiculos;
}
