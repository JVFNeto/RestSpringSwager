package com.produtos.RestSpringSwager.Repository;

import com.produtos.RestSpringSwager.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {//<Entity, Tipo do id>

    //essa interface que extend o JPARepository. serve para fazer persistencias do banco de dados

//o metodo abaixo, serve para fazer a seleção de produto unico.
    //esse metodo vai ser utilizado no return do ProdutoResouces (linha29)

    Produto findById(long id);//Tipo de retorno FINDBYID (tipo id nome id);



}
