package kr.co.sboard.entity;

import jakarta.persistence.*;
import kr.co.sboard.dto.TermsDTO;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "terms")
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
