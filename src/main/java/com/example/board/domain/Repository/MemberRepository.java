package com.example.board.domain.Repository;

import com.example.board.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;

public interface MemberRepository extends JpaRepository<Member, Long> {

    static final String UPDATE_MEMBER_LAST_LOGIN = "UPDATE member SET LAST_LOGIN_TIME = :lastLoginTime WHERE EMAIL = :email" ;

    @Transactional
    @Modifying
    @Query(value = UPDATE_MEMBER_LAST_LOGIN, nativeQuery = true)
    public int updateMemberLastLogin(@Param("email") String email, @Param("lastLoginTime")LocalDate lastLoginTime);

    public Member findByEmail(String email);

}
