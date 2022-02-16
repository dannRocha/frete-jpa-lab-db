package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "veiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_veiculo", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
public class Veiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "numero_placa")
  private String numeroPlaca;

  @ManyToOne
  private Filial filial;
}
