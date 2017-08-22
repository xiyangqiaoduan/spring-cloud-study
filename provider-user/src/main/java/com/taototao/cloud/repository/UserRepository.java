package com.taototao.cloud.repository;

import com.taototao.cloud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-22 16:04
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
