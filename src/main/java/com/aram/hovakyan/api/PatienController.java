package com.aram.hovakyan.api;


import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.common.patient.PatientUpdateDTO;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.websocket.server.PathParam;

@RequestMapping(value = "/patients")
public interface PatienController {


    @GetMapping(value = "/{patientId}")
    PatientDTO get(@PathVariable (name = "patientId") Long patientID);


    @GetMapping(path = "/{Id}")
    ResponseEntity<PageImpl<PatientDTO>> getAll(
            @NotNull @Positive @PathVariable("Id") Long Id,
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "size", required = false) Integer size);


    @PostMapping(name = "")
    PatientDTO create(@RequestBody PatientCreationDTO request);

    @PutMapping(name = "/update")
    PatientDTO update(@RequestBody PatientUpdateDTO request);

}
