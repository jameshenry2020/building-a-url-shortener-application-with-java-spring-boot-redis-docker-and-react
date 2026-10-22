package com.henrydev.shortlink.controllers;


import com.henrydev.shortlink.common.dto.request.ShortenRequestDto;
import com.henrydev.shortlink.services.RateLimitService;
import com.henrydev.shortlink.services.UrlShortenerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class UrlShortenerController {

    private final UrlShortenerService urlShortenerService;
    private final RateLimitService rateLimitService;

    @PostMapping("/shorten")
    public ResponseEntity<?> shortenUrl(@Valid @RequestBody ShortenRequestDto payload, HttpServletRequest httpReq) {

    }

}
