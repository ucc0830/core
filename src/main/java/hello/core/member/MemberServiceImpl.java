package hello.core.member;

public class MemberServiceImpl implements MemberService {


    //해당 클래스가 추상화(MemberRepository)와 구체화(MemoryMemberRepository)에 모두 의존하고 있다.
    //DIP(의존관계역전) 룰 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
