package com.cabinet.sitecabinet.service;

import com.cabinet.sitecabinet.Exception.UserNotFoundException;
import com.cabinet.sitecabinet.model.Angajat;
import com.cabinet.sitecabinet.repository.AngajatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AngajatService {
    private  AngajatRepo angajatRepo;
@Autowired
    public AngajatService(AngajatRepo angajatRepo) {
        this.angajatRepo = angajatRepo;
    }

    public Angajat addAngajat(Angajat angajat){

    return  angajatRepo.save(angajat);
    }
    public List<Angajat> listaAngajati(){
            return angajatRepo.findAll();
    }
    public Angajat updateAngajat(Angajat angajat){
           return angajatRepo.save(angajat);
    }
    public  Angajat findAngajatbyId(Long id){
    return  angajatRepo.findAngajatById(id).orElseThrow(()-> new UserNotFoundException("User by id"+id+"was not found"));
    }
    public void deleteAngajat(Long id){
       angajatRepo.deleteAngajatById(id);
    }
}
