package com.example.ludogorieSoft.village.Controller;
import com.example.ludogorieSoft.village.Model.Village;
import com.example.ludogorieSoft.village.Repository.VillageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/village")
@RequiredArgsConstructor
public class VillageController {
    @Autowired
    private VillageRepository villageRepository;

    @GetMapping
    public List<Village> village(){
        return villageRepository.findAll();
    }
}
