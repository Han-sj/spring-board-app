package kr.co.sboard.service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleDAO dao;
    private final ArticleRepository repository;

    @GetMapping("")
    public ArticleDTO get(int ano){
        return null;
    }

    @GetMapping("")
    public List<ArticleDTO> getAll(){
        return null;
    }

    @GetMapping("")
    public void register(ArticleDTO dto){
        dao.insert(dto);
    }

    @GetMapping("")
    public void modify(ArticleDTO dto){

    }

    @GetMapping("")
    public void remove(int ano){

    }


}
