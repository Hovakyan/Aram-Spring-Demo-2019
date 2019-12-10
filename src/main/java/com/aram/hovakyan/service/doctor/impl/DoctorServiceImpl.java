package com.aram.hovakyan.service.doctor.impl;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.entity.DoctorEntity;
import com.aram.hovakyan.repository.DoctorRepository;
import com.aram.hovakyan.service.doctor.DoctorService;
import com.aram.hovakyan.service.doctor.converter.DoctorConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DoctorConverter doctorConverter;

    @Override
    public DoctorDTO get(final Long doctorId) {
        return null;
    }

    @Override
    public PageImpl<DoctorDTO> all(Pageable pageable) {
        final Page<DoctorEntity> entities = doctorRepository.findAll(pageable);
        final Page<DoctorDTO> result; // TODO implement  OldDBMenuService-OldDBMenuServiceImpl MenuControllerImpl BaseController OldDBMenuConverter
        return null;
    }

    @Override
    public DoctorDTO create(DoctorCreationDTO request) {
        DoctorEntity entity = doctorConverter.convert(request);
        entity = doctorRepository.save(entity);
        return doctorConverter.convert(entity);
    }
}
