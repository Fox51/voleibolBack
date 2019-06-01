package com.app.volleyball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.volleyball.entity.Set;

@Repository
public interface SetDao extends JpaRepository<Set, Long> {

}
