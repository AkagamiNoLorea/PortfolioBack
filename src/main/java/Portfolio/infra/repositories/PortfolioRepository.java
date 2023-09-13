package portfolio.infra.repositories;

import org.springframework.stereotype.Repository;
import portfolio.domain.models.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {
}
