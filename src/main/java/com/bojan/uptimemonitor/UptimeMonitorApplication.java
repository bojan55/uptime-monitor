package com.bojan.uptimemonitor;

import com.bojan.uptimemonitor.monitor.Monitor;
import com.bojan.uptimemonitor.monitor.MonitorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UptimeMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(UptimeMonitorApplication.class, args);
    }
}
