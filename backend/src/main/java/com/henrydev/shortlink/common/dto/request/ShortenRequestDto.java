package com.henrydev.shortlink.common.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShortenRequestDto {

    @NotBlank(message = "url can not be blank please enter a valid url")
    @Pattern(regexp = "^https?://.*", message = "URL must start with http or https")
    private String orginalUrl;

    private String alias;
    private LocalDateTime expireTime;
}
