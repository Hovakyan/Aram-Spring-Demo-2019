package com.aram.hovakyan.api;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseUpdateDTO;
import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorUpdateDTO;
import com.aram.hovakyan.common.enums.DiagnoseType;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RequestMapping(value = "/diagnoses")
public interface DiagnoseController {


    @GetMapping(value = "/{diagnoseId}")
    DiagnoseDTO get(@PathVariable(name = "diagnoseId") Long diagnoseId);

    @GetMapping(name = "")
    PageImpl<DiagnoseDTO> getAll(
            @PathParam("type") DiagnoseType type, // localhost:8080/diagnoses?type=FATAL&page=0&size=5
            @PathParam("page") Integer page,
            @PathParam("size") Integer size);

    @PostMapping(name = "")
    DiagnoseDTO create(@RequestBody DiagnoseCreationDTO request);

    @PutMapping(name = "")
    DiagnoseDTO update(@RequestBody DiagnoseUpdateDTO request);



}
