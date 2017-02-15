package com.csmarton.service

import com.csmarton.domain.Hotel
import org.springframework.data.repository.CrudRepository
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long] {}
