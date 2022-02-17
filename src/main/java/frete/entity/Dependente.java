package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "dependente")
@Getter
@Setter
public class Dependente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  Funcionario funcionario;

  private String nome;

  @Column(name = "data_nascimento")
  private LocalDate dataNascimento;
}
