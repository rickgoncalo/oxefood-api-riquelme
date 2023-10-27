package br.com.ifpe.oxefood.modelo.fornecedor;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

   @Service
public class FornecedorService {

   @Autowired
   private FornecedorRepository repository;
private Object fornecedor;

   @Transactional
   public Fornecedor save(Fornecedor fornecedor, Fornecedor fornecedor2) {

       fornecedor2.setHabilitado(Boolean.TRUE);
       fornecedor.setVersao(1L);
       fornecedor.setDatafundacao(LocalDate.now());
       return repository.save(fornecedor, fornecedor);
   }
   
   public List<Fornecedor> findAll() {
  
      return repository.findAll();
  }

  public Fornecedor findById(Long id) {

      return repository.findById(id).get();    
  }

  @Transactional
  public void update(Long id, Fornecedor fornecedorAlterado) {

     Fornecedor ornecedor = repository.findById(id).get();
     fornecedor.setNome(fornecedorAlterado.getNome());
     fornecedor.setDataFundacao(fornecedorAlterado.getDataFundacao());
     fornecedor.setCpf(fornecedorAlterado.getCpf());
     fornecedor.setContatodoVendedor(fornecedorAlterado.getFoneFixo());
     ((Object) fornecedor).setFoneFixo(fornecedorAlterado.getFoneFixo());
       
     fornecedor.setVersao(((Object) fornecedor).getVersao() + 1);
     repository.save(fornecedor, fornecedor);
     
 }
 
 @Transactional
 public void delete(Long id) {

     Fornecedor fornecedor = repository.findById(id).get();
    fornecedor.setHabilitado(Boolean.FALSE);
    fornecedor.setVersao(fornecedor.getVersao() + 1);


     repository.save(cliente, fornecedor);
 }

}
 