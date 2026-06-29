package kr.co.sboard.service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.dao.TermsDAO;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.TermsDTO;
import kr.co.sboard.repository.ArticleRepository;
import kr.co.sboard.repository.TermsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class TermsService {

    private final TermsDAO dao;
    private final TermsRepository repository;

    @GetMapping("")
    public TermsDTO get(int no){
        return null;
    }

    @GetMapping("")
    public List<TermsDTO> getAll(){
        return null;
    }

    @GetMapping("")
    public void register(TermsDTO dto){

    }

    @GetMapping("")
    public void modify(TermsDTO dto){

    }

    @GetMapping("")
    public void remove(int no){

    }


}
