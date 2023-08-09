package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();   //저장소

    @Override
    public void save(Member member) {
        store.put(member.getId(), member); //회원 정보를 저장소에 저장한다.
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); //회원의 아이디를 통해 회원을 찾는다.
    }
}
