package com.group1.team1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // MySQL의 `users` 테이블과 매핑
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT 적용
	 private Long id;
	    
	 @Column(nullable = false)
	 private String name;
	    
	 @Column(nullable = false, unique = true)  // 이메일 중복 방지
	 private String email;
}
