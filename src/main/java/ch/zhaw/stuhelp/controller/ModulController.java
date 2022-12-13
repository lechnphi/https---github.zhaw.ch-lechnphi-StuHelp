package ch.zhaw.stuhelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.stuhelp.model.Modul;
import ch.zhaw.stuhelp.model.ModulCreateDTO;
import ch.zhaw.stuhelp.repository.ModulRepository;

@RestController
@RequestMapping("/api/modul")
public class ModulController {

    @Autowired
    ModulRepository modulRepository;

    @PostMapping("")
    public ResponseEntity<Modul> createModul(@RequestBody ModulCreateDTO mDTO) {
        Modul mDAO = new Modul(mDTO.getName(), mDTO.getPrice(), mDTO.getEtcs(), mDTO.getSpezialication());
        Modul m = modulRepository.save(mDAO);
        return new ResponseEntity<>(m, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Modul>> getAllModule() {
        List<Modul> allModul = modulRepository.findAll();
        return new ResponseEntity<>(allModul, HttpStatus.OK);

    }
    
}
