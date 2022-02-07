package com.produtos.RestSpringSwager.Resources;


import com.produtos.RestSpringSwager.Models.Produto;
import com.produtos.RestSpringSwager.Repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Classe que receberá as requisições HTTP da API REST
@RequestMapping(value="/api")

@Api(value="Api Rest Produtos")// anotação do swagger
@CrossOrigin(origins="*")//libera todos os dominios de acessar sua api
public class ProdutoResources {

    @Autowired
    ProdutoRepository pr;

    @GetMapping("/produtos") //esse metodo lista todos os produtos salvos no BD
    public List<Produto> listaProdutos(){//List<Produto> = listar tudo da entity produto
        return pr.findAll();
    }

    @GetMapping("/produto/{id}") //esse metodo lista o produto do{id}
    public Produto listaProdutoUnico(@PathVariable(value="id")long id){//Seleciona o id

        //para alinha abaixo foi utilizado o "metodo" feito em ProdutoResources (linha 13)
        return pr.findById(id);
    }

    @PostMapping("/produto")//Produto(da linha de baixo) = vai retornar o produto que foi salvo
    //RequestBody é porque o metodo Post vai no corpo da requisição
    public Produto salvaProduto(@RequestBody Produto produto ) { // tipo objeto

        return pr.save(produto);
    }
    @DeleteMapping("/produto")
    //Como ele vai deletar, ele não retorna nada, então seu tipo é void
    public void deletaProduto(@RequestBody Produto produto ) { // tipo objeto

        pr.delete(produto); // como é do tipo void, ele não tem return
    }
    @PutMapping("produto")
    public Produto atualizaProduto(@RequestBody Produto produto){

        return pr.save(produto);
    }
}
