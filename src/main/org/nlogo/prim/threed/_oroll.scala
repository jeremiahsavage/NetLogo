package org.nlogo.prim.threed

import org.nlogo.api.Syntax
import org.nlogo.nvm.{ Context, Reporter }

class _oroll extends Reporter {
  override def syntax =
    Syntax.reporterSyntax(Syntax.NumberType)
  override def report(context: Context) =
    java.lang.Double.valueOf(world.observer.roll)
}
