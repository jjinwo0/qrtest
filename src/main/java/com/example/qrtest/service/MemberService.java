package com.example.qrtest.service;

import com.example.qrtest.dto.MemberDTO;
import com.example.qrtest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public String SignUpApi(MemberDTO.SignUpDTO signUpDTO) throws Exception{
        if (signUpDTO.getUsername().equals(null)||signUpDTO.getPassword().equals(null)){
            throw new IllegalStateException("아이디 또는 비밀번호가 입력되지 않았습니다.");
        }else {
            memberRepository.save(signUpDTO.toEntity());
            return "회원가입이 정상적으로 동작하였습니다.";
        }
    }
}