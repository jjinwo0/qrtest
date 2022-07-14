package com.example.qrtest.dto;

import com.example.qrtest.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {

    @Getter
    @Setter
    public class SignUpDTO{
        @NotBlank(message = "아이디는 필수 입력값입니다")
        private String username;
        @NotBlank(message = "비밀번호는 필수 입력값입니다")
        private String password;

        public Member toEntity(){
            return Member.builder()
                    .username(username)
                    .password(password)
                    .build();
        }
    }
}
