package com.aram.hovakyan.api;


import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.common.patient.PatientUpdateDTO;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RequestMapping(value = "/patients")
public interface PatienController {



    @GetMapping(name = "/{patientid}")
    PatientDTO get(@PathVariable (name = "patientid") Long patientID);



    @GetMapping(name = "")
    PageImpl<PatientDTO> getAll(
            @PathParam("page") Integer page, @PathParam("size") Integer size);


    @PostMapping(name = "/create")
    PatientDTO create(@RequestBody PatientCreationDTO request);

    @PostMapping(name = "/update")
    PatientDTO update(@RequestBody PatientUpdateDTO request);

}
