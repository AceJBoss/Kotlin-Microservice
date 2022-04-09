package com.lytquest.company.controller

import com.lytquest.company.model.Company
import com.lytquest.company.repository.CompanyRepository
import com.lytquest.company.service.Impl.CompanyServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class CompanyController {

    @Autowired
    lateinit var companyServiceImpl: CompanyServiceImpl;

    @PostMapping("/save")
    fun save(@RequestBody company: Company): String{
        companyServiceImpl.createCompany(company)
        return "Company Data Sved Successfully."
    }

    @GetMapping("/getAll")
    fun getCompany() : List<Company>{
        return companyServiceImpl.getAllCompany()
    }

    @GetMapping("/getCompany/{mame}")
    fun getCompanyByName(@PathVariable  name: String): Company{
        return companyServiceImpl.getCompanyByName(name);
    }

//    @DeleteMapping("/remove/{id}")
//    fun deleteCompany(@PathVariable id: Int): String{
//        companyRepository.delete(id)
//        return "Record deleted successfully"
//    }
}