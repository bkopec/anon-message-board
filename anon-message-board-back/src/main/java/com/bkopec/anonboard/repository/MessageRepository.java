package com.bkopec.anonboard.repository;

import com.bkopec.anonboard.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Page<Message> findByTopicIdOrderByCreatedAtAsc(Long topicId, Pageable pageable);
}