package com.example.demo.respository;

import com.example.demo.entities.BaseEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I>
{
}
