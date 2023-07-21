package tweeks.tweeksspring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tweeks.tweeksspring.repository.MemberRepository;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
