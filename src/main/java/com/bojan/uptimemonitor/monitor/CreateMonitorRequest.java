package com.bojan.uptimemonitor.monitor;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public record CreateMonitorRequest(

        @NotBlank
        @Size(max = 100)
        String name,

        @NotBlank
        @Size(max = 500)
        @URL
        String url,

        @Min(10)
        @Max(3600)
        Integer intervalSeconds
) {
}
