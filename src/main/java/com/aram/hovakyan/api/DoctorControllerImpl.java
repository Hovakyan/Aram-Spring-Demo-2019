package com.aram.hovakyan.api;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.doctor.DoctorUpdateDTO;
import com.aram.hovakyan.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.Assert.notNull;

@RestController
public class DoctorControllerImpl implements DoctorController{

    @Autowired
    private DoctorService doctorService;

    @Override
    public DoctorDTO get(Long doctorId) {
        notNull(doctorId, "DoctorId can not be null");
        return doctorService.get(doctorId);
    }

    @Override
    public PageImpl<DoctorDTO> getAll(Integer page, Integer size) {


        return doctorService.all(getPageable(page,size));
    }

    @Override
    public DoctorDTO create(final DoctorCreationDTO request) {
        return doctorService.create(request);
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO request) {
        return null;
    }
}
