package kr.co.sboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kr.co.sboard.dto.TermsDTO;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Terms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ano;
    private String basic;
    private String privacy;

    public TermsDTO toDTO(){
        return TermsDTO.builder()
                .ano(ano)
                .basic(basic)
                .privacy(privacy)
                .build();
    }

}
