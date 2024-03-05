package portfolio.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.domain.models.Portfolio;
import portfolio.infra.repositories.PortfolioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;

    @Autowired
    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public List<Portfolio> getPortfolio() {
        return portfolioRepository.findAll();
    }

    public void newPortfolio(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
    }

    public Portfolio portfolioById(Integer id) {
        Optional<Portfolio> portfolioByID = portfolioRepository.findById(id);
        return portfolioByID.orElse(null);
    }

    public void update(Integer id, Portfolio portfolio) {
        Portfolio portfolioExisting = portfolioById(id);

        if (portfolioExisting == null) {
            System.out.println("error");
        }

        portfolioExisting.setNombre(portfolio.getNombre());
        portfolioExisting.setDescripcion(portfolio.getDescripcion());
        portfolioExisting.setImg(portfolio.getImg());
        portfolioExisting.setLenguaje(portfolio.getLenguaje());
        portfolioExisting.setEnlace(portfolio.getEnlace());
        portfolioExisting.setDespliegue(portfolio.getDespliegue());

        portfolioRepository.save(portfolioExisting);
    }
        public void delete(Integer id) {
        boolean existe = portfolioRepository.existsById(id);
        if (existe) {
            portfolioRepository.deleteById(id);
        }
    }
}
