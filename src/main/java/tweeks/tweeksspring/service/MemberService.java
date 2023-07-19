package tweeks.tweeksspring.service;

import tweeks.tweeksspring.domain.Member;
import tweeks.tweeksspring.repository.MemberRepository;
import tweeks.tweeksspring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

// 서비스 클래스는 비즈니스에 의존적으로 기획
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public long join(Member member){
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findbyName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}