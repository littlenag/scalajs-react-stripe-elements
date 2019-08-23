package io.github.littlenag.scalajs.components.`react-stripe-elements`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  *
  */
object StripeProvider extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(apiKey: js.UndefOr[String] = js.undefined): WithProps = auto
}
