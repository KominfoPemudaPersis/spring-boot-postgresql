package com.hendisantika.postgres.repository;

import com.hendisantika.postgres.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/18
 * Time: 18.52
 * To change this template use File | Settings | File Templates.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}