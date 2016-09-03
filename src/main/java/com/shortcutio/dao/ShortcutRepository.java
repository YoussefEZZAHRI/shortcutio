package com.shortcutio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shortcutio.entities.Shortcut;

public interface ShortcutRepository extends JpaRepository<Shortcut, Long>{

}
