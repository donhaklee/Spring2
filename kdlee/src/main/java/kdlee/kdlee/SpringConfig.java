package kdlee.kdlee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kdlee.kdlee.repository.MemberRepository;
import kdlee.kdlee.repository.MemoryMemberRepository;
import kdlee.kdlee.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
