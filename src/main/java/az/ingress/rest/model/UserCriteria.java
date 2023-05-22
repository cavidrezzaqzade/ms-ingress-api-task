package az.ingress.rest.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

/**
 * @author caci
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCriteria {
    private Long id;
    private String name;
    private Short age;
}
