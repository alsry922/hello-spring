package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
  Member save(Member member);
  /*널 값이 올 수도 있을 경우 보통 Optional 많이 사용*/
  Optional<Member> findById(Long id);
  Optional<Member> findByName(String name);
  List<Member> findAll();
}
