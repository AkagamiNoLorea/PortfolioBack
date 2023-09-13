package portfolio.apiControllers;

import portfolio.domain.models.Portfolio;
import portfolio.domain.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "api/portfolio")
public class PortfolioController {
    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping
    public List<Portfolio> getPortfolioController() {
        return portfolioService.getPortfolio();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Portfolio> getPortfolioById(@PathVariable Integer id) {
        // Lógica para obtener la cita por ID y devolverla en la respuesta ResponseEntity
        Portfolio portfolio = portfolioService.portfolioById(id);
        if (portfolio != null ) {
            return ResponseEntity.ok(portfolio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void createPortfolio(@RequestBody Portfolio portfolio) {
        portfolioService.newPortfolio(portfolio);
    }

    @PutMapping("/{id}")
    public void updatePortfolio(@PathVariable Integer id, @RequestBody Portfolio portfolio) {
        portfolioService.update(id, portfolio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        portfolioService.delete(id);
    }
}