package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
// 보통 ibatis, mybatis 등에서 DAO라고 불리는 DB Layer 접근자
// JPA에서는 Repository라고 부르며 인터페이스로 생성합니다.
// 단순히 인터페이스를 생성 후, JpaRepository<Entity클래스, PK타입>을 상속하면 기본적인 CRUD 메서드가 자동으로 생성
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
