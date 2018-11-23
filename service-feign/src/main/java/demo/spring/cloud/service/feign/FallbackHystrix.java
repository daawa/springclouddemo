package demo.spring.cloud.service.feign;

import org.springframework.stereotype.Component;

/**
 * @author mochuan.zzw
 */

@Component
public class FallbackHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + ", error";
    }
}
