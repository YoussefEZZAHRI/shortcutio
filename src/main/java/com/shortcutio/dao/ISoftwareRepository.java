package com.shortcutio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shortcutio.entities.Software;

public interface ISoftwareRepository extends JpaRepository<Software,Long>{

}
