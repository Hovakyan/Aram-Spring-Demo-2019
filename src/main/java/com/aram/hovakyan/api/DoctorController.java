package com.aram.hovakyan.api;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.doctor.DoctorUpdateDTO;
import com.aram.hovakyan.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RequestMapping(value = "/doctors")
public interface DoctorController {

    @GetMapping(value = "/{doctorId}")
    DoctorDTO get(@PathVariable(name = "doctorId") Long doctorId);

    @GetMapping(name = "")
    PageImpl<DoctorDTO> getAll(@PathParam("page") Integer page,
                               @PathParam("size") Integer size);

    @PostMapping(name = "")
    DoctorDTO create(@RequestBody DoctorCreationDTO request);

    @PutMapping(name = "")
    DoctorDTO update(@RequestBody DoctorUpdateDTO request);

}

