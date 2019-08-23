package io.github.littlenag.scalajs.components.`react-stripe-elements`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  *
  */
object Elements extends ReactBridgeComponent {

  @JSImport("react-stripe-elements", "Elements")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(): WithProps = auto
}
