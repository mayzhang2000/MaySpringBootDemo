package com.apress.repository;

import org.springframework.data.repository.CrudRepository;
import com.apress.domain.Poll;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {

}