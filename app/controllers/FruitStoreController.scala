package controllers

import play.api.mvc.Controller
import play.api.mvc._
import models.Fruit
import services.FruitService
import forms.FormFruit._


/**
  * Created by mgwarada on 12/02/17.
  */
trait FruitStoreController extends Controller {

  this: Controller =>

  val fruitService = new FruitService
  val apple = Fruit("apple", 0.60)
  val orange = Fruit("orange", 0.25)

  def index = Action {
    Ok(views.html.index(fruitsForm))
  }

  def addFruit = Action { implicit request =>

    fruitsForm.bindFromRequest.fold(
      errors => BadRequest,
      fruits => {

        val apples = List.fill(fruits.apples.getOrElse(0))(apple)
        val oranges = List.fill(fruits.oranges.getOrElse(0))(orange)
        val fruitList = apples ::: oranges

        val totalprice = fruitService.calculateTotalPayment(fruitList)
        Redirect(routes.FruitStoreController.checkout(totalprice.toString))
      }
    )
  }

  def checkout(totalPrice: String) = Action { implicit request =>
    Ok(views.html.checkout(totalPrice))
  }

}


object FruitStoreController extends FruitStoreController


