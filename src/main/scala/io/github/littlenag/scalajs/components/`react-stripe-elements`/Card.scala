package io.github.littlenag.scalajs.components.`react-stripe-elements`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  *
  */
object CardElement extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "CardElement")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(): WithProps = auto
}

object CardNumberElement extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "CardNumberElement")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(): WithProps = auto
}

object CardExpiryElement extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "CardExpiryElement")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(): WithProps = auto
}

object CardCvcElement extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "CardCvcElement")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(): WithProps = auto
}