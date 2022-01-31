package com.examplegroupe.interiorservice.service;

import com.examplegroupe.interiorservice.entity.Info;
import com.examplegroupe.interiorservice.repository.InfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public Info saveInfo(Info info) {
        log.info("inside SaveInfo of InfoService");
        return infoRepository.save(info);
    }

    public Info findInfoById(Long id) {
        return infoRepository.findByInfoId(id);
    }

}
