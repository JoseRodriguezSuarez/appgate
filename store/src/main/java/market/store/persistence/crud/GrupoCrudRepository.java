package market.store.persistence.crud;

import market.store.persistence.entity.Grupo;
import market.store.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GrupoCrudRepository extends CrudRepository<Grupo, Integer> {
  Optional<List<Producto>> findByIdGrupo(Integer IdGrupo);
}
