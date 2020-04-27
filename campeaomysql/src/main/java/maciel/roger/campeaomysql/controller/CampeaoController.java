package maciel.roger.campeaomysql.controller;

import maciel.roger.campeaomysql.model.CampeaoEntity;
import maciel.roger.campeaomysql.repository.CampeaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    @author Roger Maciel
    @since 27/04/2020
    @version 1.0
 */
@RestController
@RequestMapping("/campeoes")
public class CampeaoController {
    @Autowired
    private CampeaoRepository campeaoRepository;

    @GetMapping
    public ResponseEntity<List<CampeaoEntity>> findAll() {
        return new ResponseEntity<List<CampeaoEntity>>(
                (List<CampeaoEntity>) this.campeaoRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CampeaoEntity> findById(@PathVariable("id") long id) {
        if(this.campeaoRepository.findById(id).isPresent()) {
            return new ResponseEntity<CampeaoEntity>(
                    this.campeaoRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<CampeaoEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
        public ResponseEntity<CampeaoEntity> store(@RequestBody CampeaoEntity clientEntity) {
        return new ResponseEntity<CampeaoEntity>(
                this.campeaoRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CampeaoEntity> update(@PathVariable("id") long id,
                                               @RequestBody CampeaoEntity clientEntity) throws Exception {

        if(id == 0 || !this.campeaoRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }

        return new ResponseEntity<CampeaoEntity>(
                this.campeaoRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CampeaoEntity> delete(@PathVariable("id") long id) {
        this.campeaoRepository.deleteById(id);
        return new ResponseEntity<CampeaoEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
