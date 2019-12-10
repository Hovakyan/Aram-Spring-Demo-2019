package com.aram.hovakyan.service.doctor;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {

    DoctorDTO get(Long doctorId);
    PageImpl<DoctorDTO> all(Pageable pageable);
    DoctorDTO create(DoctorCreationDTO request);
}
