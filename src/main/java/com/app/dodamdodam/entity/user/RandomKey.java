package com.app.dodamdodam.entity.user;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString
@Table(name = "TBL_RANDOM_KEY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RandomKey {
    @Id @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;

    @NotNull
    private String randomKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

}
