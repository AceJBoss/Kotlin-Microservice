package com.lytquest.company.repository

import com.lytquest.company.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository : JpaRepository<Company, Int> {
    fun findByName(name: String): Company
}