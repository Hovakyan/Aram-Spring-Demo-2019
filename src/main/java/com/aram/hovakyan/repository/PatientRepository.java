package com.aram.hovakyan.repository;

import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {


PatientDTO findByDoctorEntity_Id(Long id);

}
