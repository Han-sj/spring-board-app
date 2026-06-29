package kr.co.sboard.service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.dao.UserDAO;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.UserDTO;
import kr.co.sboard.repository.ArticleRepository;
import kr.co.sboard.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDAO dao;
    private final UserRepository repository;

    @GetMapping("")
    public UserDTO get(String userid){
        return null;
    }

    @GetMapping("")
    public List<UserDTO> getAll(){
        return null;
    }

    @GetMapping("")
    public void register(UserDTO dto){

    }

    @GetMapping("")
    public void modify(UserDTO dto){

    }

    @GetMapping("")
    public void remove(String userid){

    }


}
