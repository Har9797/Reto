/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto.controller;

import java.util.List;
import Reto.entity.Game;
import Reto.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/Game")
/**
 *
 * @author Har
 */
public class GameController {
    @Autowired
    private GameService service;
    
    @GetMapping("/all")
    public List<Game> findAllGame(){
        return service.getGameAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addGame(@RequestBody Game game){
        service.saveGameAll(game);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateGame(@RequestBody Game game){
        service.UpdateGame(game);
        return ResponseEntity.status(201).build();
    }    

    @DeleteMapping("/delete")    
        public ResponseEntity deleteGame(@RequestBody Game game){
        service.deleteGame(game.getId());
        return ResponseEntity.status(204).build();
    }
}
