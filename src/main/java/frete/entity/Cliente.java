package frete.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@DiscriminatorValue("cliente")
public final class Cliente extends PessoaFisica {
  @OneToMany(mappedBy = "cliente")
  private Set<Frete> fretes;
}
