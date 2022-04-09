package com.lytquest.company.service.Impl

import com.lytquest.company.model.Company
import com.lytquest.company.repository.CompanyRepository
import com.lytquest.company.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl : CompanyService {

    @Autowired
    lateinit var companyRepository: CompanyRepository

    override fun createCompany(company: Company) {
        companyRepository.save(company)
    }

    override fun getAllCompany(): List<Company> {
        return companyRepository.findAll()
    }

    override fun getCompanyByName(name: String): Company {
        return companyRepository.findByName(name)
    }
}