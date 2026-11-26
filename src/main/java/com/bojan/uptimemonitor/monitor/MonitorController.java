package com.bojan.uptimemonitor.monitor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/monitors")
@RequiredArgsConstructor
public class MonitorController {

    private final MonitorService monitorService;

    @GetMapping
    public List<MonitorResponse> getAll(){
        return monitorService.findAll();
    }

    @GetMapping("/{id}")
    public MonitorResponse getById(@PathVariable Long id){
        return monitorService.findById(id);
    }
}
