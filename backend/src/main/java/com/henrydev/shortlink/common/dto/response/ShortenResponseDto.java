package com.henrydev.shortlink.common.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShortenResponseDto {

    private String shortUrl;
    private String shortcode;
    private String originalUrl;
    private LocalDateTime createdAt;
    private LocalDateTime expiryAt;

}
