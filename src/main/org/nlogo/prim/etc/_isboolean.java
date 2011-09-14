package org.nlogo.prim.etc;

import org.nlogo.api.LogoException;
import org.nlogo.nvm.Reporter;
import org.nlogo.api.Syntax;

public final strictfp class _isboolean
    extends Reporter
    implements org.nlogo.nvm.Pure {
  @Override
  public Object report(final org.nlogo.nvm.Context context) throws LogoException {
    Object thing = args[0].report(context);
    return (thing instanceof Boolean) ? Boolean.TRUE : Boolean.FALSE;
  }

  @Override
  public Syntax syntax() {
    int[] right = {Syntax.WildcardType()};
    int ret = Syntax.BooleanType();
    return Syntax.reporterSyntax(right, ret);
  }
}




