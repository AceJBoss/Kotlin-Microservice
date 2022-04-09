package com.lytquest.company.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class Company(
    @Id
    @GeneratedValue
    var id: Int = 0,
    var name: String = "",
    var address: String = ""
    )