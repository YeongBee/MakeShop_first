package myshop.firstshop.repository;

import lombok.RequiredArgsConstructor;
import myshop.firstshop.domain.Member;
import myshop.firstshop.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
