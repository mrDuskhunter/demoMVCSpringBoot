package org.example.demomvcapplication.repository;

import org.example.demomvcapplication.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
   List<Message> findByTag(String tag);
}
