package tweeks.tweeksspring.repository;

import org.springframework.stereotype.Repository;
import tweeks.tweeksspring.domain.Member;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
