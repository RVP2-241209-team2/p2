package com.revature.shoply.login.controller;

import com.revature.shoply.login.service.LoginService;
import com.revature.shoply.models.DTOs.LoginDTO;
import com.revature.shoply.models.DTOs.OutgoingUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This Controller will handle login from all users.
 * Default url is: /api/v1/users/login
 */
@RestController
@RequestMapping("/api/v1/users/login")
@CrossOrigin
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * Handles the HTTP POST request for user login.
     *
     * This endpoint allows users to log in by providing their credentials in the request body.
     * It then  passes the user provided login info to LoginService method login to processes
     * the login request, authenticates the user, and returns the user's information
     * if the login is successful.
     *
     * @param loginDTO The {@link LoginDTO} object containing the login credentials (e.g., username and password).
     * @return A {@link ResponseEntity} containing an {@link OutgoingUserDTO} object representing the logged-in user's details.
     *         Returns an HTTP 200 (OK) status if the login is successful.
     */
    @PostMapping
    public ResponseEntity<OutgoingUserDTO> login(@RequestBody LoginDTO loginDTO){
        OutgoingUserDTO loggedInUser = loginService.login(loginDTO);

        return ResponseEntity.ok(loggedInUser);
    }
}