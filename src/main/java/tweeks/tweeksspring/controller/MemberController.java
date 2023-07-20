package tweeks.tweeksspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tweeks.tweeksspring.service.MemberService;

@Controller
public class MemberController {
    // MemberController가 Spring Controller에 등록되어 객체 생성
    // Spring Container에서 Spring Bean이 관리된다
    // 떄문에 Spring과 관련된 동작이 작동할 수 있음

    private final MemberService memberService;

    // 의존관계 주입
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
    // new로 하지 않고, 스프링 컨테이너에서 가져와서 써야 함
    // new로 하면 다른 곳에서도 계속 씀
    // 하나만 생성해서 계속 쓰는것이 좋음
    // Autowired를 사용하면 자동으로 Bean에 등록
}
