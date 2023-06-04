package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder
// @Builder를 이용해서 객체를 생성할 수 있게 처리한다. 단 (@AllArgsConstructor, @NoArgsConstructor)를 같이 사용해야 컴파일 에러가 나지 않는다.
//
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memo;

    @Column(length = 200, nullable = false)
    private String memoText;
}
