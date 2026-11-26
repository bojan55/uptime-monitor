package com.bojan.uptimemonitor.monitor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonitorService {

    private final MonitorRepository monitorRepository;

    @Transactional(readOnly = true)
    public List<MonitorResponse> findAll(){
        return monitorRepository.findAll()
                .stream()
                .map(MonitorResponse::from)
                .toList();
    }

    @Transactional(readOnly = true)
    public MonitorResponse findById(Long id){
        return monitorRepository.findById(id)
                .map(MonitorResponse::from)
                .orElseThrow(() -> new MonitorNotFoundException(id));
    }
}
