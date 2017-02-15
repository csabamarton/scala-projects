package com.csmarton.domain

import javax.persistence.{Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

@Entity
class Hotel {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var address: String = _

  @BeanProperty
  var zip: String = _
}
