package br.com.ifpe.oxefood.modelo.fornecedor;

public class FornecedorRepository {

    public List<Fornecedor> findAll() {
        return null;
    }
    import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

    
   
    public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    
      
    }
    }
}
