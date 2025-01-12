package voce.com.programar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voce.com.programar.domain.livro.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
