package qt.network

import qt.core._
import SignalCallback._

import scalanative._
import unsafe._
import cxx._
import qt.macros._

import scala.scalanative.runtime.RawPtr

/**
 * @see [[https://doc.qt.io/qt-5/qnetworkreply.html]]
 */
@Qt
@include("<QNetworkReply>")
class QNetworkReply extends QIODevice {

  def isFinished: Boolean = extern
  def isRunning: Boolean = extern

  def onFinished(cb: SignalCallback0, ctx: RawPtr): Unit = signal
  def onFinished(cb: ()=>Unit): Unit = onFinished( fromFunction0(cb), cb.toCtx )
}

object QNetworkReply {
}