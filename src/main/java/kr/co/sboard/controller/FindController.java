package kr.co.sboard.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@RequiredArgsConstructor
@Controller
public class FindController {

    @GetMapping("/find/changepassword")
    public String changePassword() {
        return "/find/changepassword";
    }

    @GetMapping("/find/password")
    public String password() {
        return "/find/password";
    }

    @GetMapping("/find/resultuserid")
    public String resultUserid() {
        return "/find/resultuserid";
    }

    @GetMapping("/find/userid")
    public String userid() {
        return "/find/userid";
    }


}
