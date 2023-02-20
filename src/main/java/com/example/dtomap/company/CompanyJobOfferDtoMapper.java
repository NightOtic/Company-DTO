package com.example.dtomap.company;

import com.example.dtomap.joboffer.JobOffer;
import org.springframework.stereotype.Service;

@Service
class CompanyJobOfferDtoMapper {
    CompanyJobOfferDto map(JobOffer jobOffer) {
        CompanyJobOfferDto dto = new CompanyJobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        return dto;
    }
}