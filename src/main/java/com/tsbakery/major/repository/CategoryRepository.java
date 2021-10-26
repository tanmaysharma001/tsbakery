package com.tsbakery.major.repository;

import com.tsbakery.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

/* extending jpa provides us with the functionalities such as find, save and other processes,
class- category and primary key will be of integer. Helps in decoupling of code. */

