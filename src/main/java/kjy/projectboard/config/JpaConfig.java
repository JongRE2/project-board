package kjy.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {
    //auditing할때 사람이름정보를 넣어주기 위해, @Bean을 쓴다.
    @Bean
    AuditorAware<String> auditorAware(){
        return () -> Optional.of("kjy"); // TODO : 스프링 시큐리티인증 기능을 붙이게 될때, 수정하자.
    }

/*
이렇게 함으로써 JPA의 auditing을 할때마다 사람이름은 "kjy"로 넣게 된다.
*/

}
