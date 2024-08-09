package ru.tardyon.account.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tardyon.account.dto.LoginDTO;
import ru.tardyon.account.dto.TokenDTO;

@RestController
@RequestMapping(value = "api/v1/auth")
@AllArgsConstructor
public class AuthController {

    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO loginDto) {
        String token = authService.login(loginDto);
        TokenDTO tokenDto = new TokenDTO(token);
        return new ResponseEntity<>(tokenDto, HttpStatus.OK);
    }
}
