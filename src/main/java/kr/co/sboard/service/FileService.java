package kr.co.sboard.service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.dao.FileDAO;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.FileDTO;
import kr.co.sboard.repository.ArticleRepository;
import kr.co.sboard.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class FileService {

    private final FileDAO dao;
    private final FileRepository repository;

    @GetMapping("")
    public FileDTO get(int fno){
        return null;
    }

    @GetMapping("")
    public List<FileDTO> getAll(){
        return null;
    }

    @GetMapping("")
    public void register(FileDTO dto){

    }

    @GetMapping("")
    public void modify(FileDTO dto){

    }

    @GetMapping("")
    public void remove(int fno){

    }


}
