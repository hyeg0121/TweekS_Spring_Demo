package tweeks.tweeksspring.repository;

import tweeks.tweeksspring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findbyName(String name);
    List<Member> findAll();
}
