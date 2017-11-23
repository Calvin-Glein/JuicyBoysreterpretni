import java.util.Stack;

public class SymbolTable 
{
	private Stack<Scope> scope;
	
	public SymbolTable ()
	{
		scope = new Stack<>();
	}
	
	public Scope getScope()
	{
		return scope.peek();
	}
	
	public void enterScope()
	{
		/*Scope sc = new Scope();
		scope.push(sc);*/

	}
	
	public void exitScope()
	{
		scope.pop();
	}
}
