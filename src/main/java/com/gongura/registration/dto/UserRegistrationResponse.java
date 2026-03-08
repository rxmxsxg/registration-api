package com.gongura.registration.dto;

import java.time.LocalDateTime;

public record UserRegistrationResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        LocalDateTime createdAt
) {}
