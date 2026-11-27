package com.bojan.uptimemonitor.monitor;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MonitorResponse create(@Valid @RequestBody CreateMonitorRequest request){
        return monitorService.create(request);
    }
}
