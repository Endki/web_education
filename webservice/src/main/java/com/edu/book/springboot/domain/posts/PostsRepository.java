package com.edu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//Entity 클래스 , PK 타입
//파일 위치상 Entity 클래스와 Entity Repository는 함께 위치해야함
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
