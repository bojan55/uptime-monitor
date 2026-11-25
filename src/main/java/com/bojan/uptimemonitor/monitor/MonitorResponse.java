package com.bojan.uptimemonitor.monitor;

import java.time.LocalDateTime;

public record MonitorResponse(
    Long id,
    String name,
    String url,
    int intervalSeconds,
    boolean enabled,
    LocalDateTime createdAt
) {
    public static MonitorResponse from(Monitor monitor) {
        return new MonitorResponse(
                monitor.getId(),
                monitor.getName(),
                monitor.getUrl(),
                monitor.getIntervalSeconds(),
                monitor.isEnabled(),
                monitor.getCreatedAt()
        );
    }
}
