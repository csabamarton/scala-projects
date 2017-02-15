package com.csmarton.controller

import com.csmarton.service.HotelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(Array("/hotels"))
class HotelController @Autowired() (private val hotelRepository: HotelRepository) {

  @RequestMapping(Array("/list"))
  def list(model: Model) = {
    val hotels = hotelRepository.findAll()

    model.addAttribute("hotels", hotels)

    "hotels/list"
  }
}
