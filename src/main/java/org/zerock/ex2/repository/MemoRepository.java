package org.zerock.ex2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findByMemoBetweenOrderByMemoDesc(Long from, Long to);
    Page<Memo> findByMemoBetween(Long from, Long to, Pageable pageable);

    void deleteMemoByMemoLessThan(Long num);
}
