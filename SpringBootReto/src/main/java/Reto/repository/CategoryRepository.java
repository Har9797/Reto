/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto.repository;

import Reto.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Har
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    
}
