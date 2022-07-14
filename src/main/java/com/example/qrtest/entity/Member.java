package com.example.qrtest.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @Builder
    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
