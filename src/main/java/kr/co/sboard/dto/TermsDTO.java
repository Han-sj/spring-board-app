package kr.co.sboard.dto;

import kr.co.sboard.entity.Terms;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TermsDTO {

    private int ano;
    private String basic;
    private String privacy;

    public Terms toEntity(){
        return Terms.builder()
                .ano(ano)
                .basic(basic)
                .privacy(privacy)
                .build();
    }

}
