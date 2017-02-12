package forms

/**
  * Created by mgwarada on 12/02/17.
  */

import play.api.data.Form
import play.api.data.Forms._

case class FruitsForms(apples: Option[Int], oranges: Option[Int])

object FormFruit {

  val fruitsForm: Form[FruitsForms] = Form(mapping(
    "apples" -> optional(number),
    "oranges" -> optional(number)
  )(FruitsForms.apply)(FruitsForms.unapply))

}
