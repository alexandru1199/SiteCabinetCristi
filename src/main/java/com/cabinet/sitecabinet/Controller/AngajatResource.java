package com.cabinet.sitecabinet.Controller;

import com.cabinet.sitecabinet.model.Angajat;
import com.cabinet.sitecabinet.service.AngajatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/angajat")
public class AngajatResource    {
    private  final AngajatService angajatService;
    @Autowired
    public AngajatResource(AngajatService angajatService) {
        this.angajatService = angajatService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Angajat>> getAngajati(){
     List<Angajat> angajati=angajatService.listaAngajati();
     return  new ResponseEntity<>(angajati, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Angajat> getAngajatById(@PathVariable("id") Long id){
        Angajat angajat=angajatService.findAngajatbyId(id);
        return  new ResponseEntity<>(angajat, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Angajat> addAngajat(@RequestBody Angajat angajat) {
    Angajat newAngajat=angajatService.addAngajat(angajat);
        return  new ResponseEntity<>(newAngajat, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Angajat> updateAngajat(@RequestBody Angajat angajat) {
        Angajat newAngajat=angajatService.updateAngajat(angajat);
        return  new ResponseEntity<>(newAngajat, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAngajat(@PathVariable("id") Long id) {
        angajatService.deleteAngajat(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
