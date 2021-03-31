package com.edu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
//setter 메소드가 없는 이유 = 클래스의 인스턴스 값들이 언제 어디서 변해야하는지 코드상으로 명확하게 구분 불가함 -> 차후 기능 변경시 복잡
// 그렇기 때문에 Entity 클래스에서는 절대로 Setter 메소드를 만들지 않는다.
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    //어떤 필드에 어떤 값을 넣어야할지 명확하게 구분하기 위해 생성자 말고 Builder를 사용함
    @Builder
    public Posts(String title, String content,String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
