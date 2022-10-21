package cat.itacademy.barcelonactiva.GurguiBallv.Gerard.s05.t02.n01.controllers;

import cat.itacademy.barcelonactiva.GurguiBallv.Gerard.s05.t02.n01.DTO.JugadorDTO;
import cat.itacademy.barcelonactiva.GurguiBallv.Gerard.s05.t02.n01.entities.Jugador;
import cat.itacademy.barcelonactiva.GurguiBallv.Gerard.s05.t02.n01.service.JugadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class JugadorController {

    private JugadorService jugadorService;

    public JugadorController(JugadorService jugadorService){
        this.jugadorService = jugadorService;
    }

    ////CRUD
        //--> CREATE
    @PostMapping("/add")
    public ResponseEntity<JugadorDTO> addPlayer(@RequestBody JugadorDTO jugadorDTO){

        return new ResponseEntity<>(jugadorService.createPlayer(jugadorDTO), HttpStatus.CREATED);

    }


        //--> READ
    @GetMapping("/findAll")
    public List<JugadorDTO> getAllPlayers(){

        return jugadorService.findAllPlayers();
    }

        //--> UPDATE

        //--> DELETE


}