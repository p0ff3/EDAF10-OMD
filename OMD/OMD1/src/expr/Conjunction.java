package expr;

import java.util.Map;

public class Conjunction extends TwoVariableExpr {

	public Conjunction(Expr e1, Expr e2) {
		super(e1,e2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (e1.value(map) && e2.value(map)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String op(){
		return "AND";
	}

}
