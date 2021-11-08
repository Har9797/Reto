/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto.service;

import Reto.entity.Score;
import Reto.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Har
 */
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    public Score saveScoreAll(Score score){
        return repository.save(score);
    }

    public List<Score> getScoreAll(){
        return repository.findAll();
    }

    public Score updateScore(Score score){
        Score existeScore=repository.findById(score.getId()).orElse(null);
        existeScore.setCalificacion(score.getCalificacion());
        return repository.save(existeScore);
    }

    public String deleteScore(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    }
}
