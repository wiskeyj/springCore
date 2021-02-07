package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy disocuntPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy disocuntPolicy) {
        this.memberRepository = memberRepository;
        this.disocuntPolicy = disocuntPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = disocuntPolicy.discount(member,itemPrice);

        return  new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
