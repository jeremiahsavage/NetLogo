// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc

import org.nlogo.nvm.{ Context, Reporter }

class _maxpycor extends Reporter {
  override def report(context: Context): java.lang.Double =
    report_1(context)
  def report_1(context: Context): java.lang.Double =
    world.maxPycorBoxed
  def report_2(context: Context): Double =
    world.maxPycor
}
