/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Modelo.Gama;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.example.demo.Interface.GamaInterface;

/**
 *
 * @author usuario
 */
@Repository
public class GamaRepositorio {
    @Autowired
    private GamaInterface gamaCrudRepository;
    
    public List<Gama> getAll (){
        return (List<Gama>) gamaCrudRepository.findAll();
    }
    public Optional<Gama> getGama(int id){
    return gamaCrudRepository.findById(id);
    }
    public Gama save (Gama gama){
    return gamaCrudRepository.save(gama);
    }
    
}
