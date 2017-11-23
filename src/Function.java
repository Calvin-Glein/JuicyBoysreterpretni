import java.util.ArrayList;


public class Function extends Symbol {
	private String signature;
	private String return_type;
	private ArrayList<Variable> parameters;
	//private JuicyBoysParser.NormalClassDeclarationContext ctx;
	
	/*public Function(String return_type, String signature, ArrayList<Variable> parameters, JuicyBoysParser.NormalClassDeclarationContext ctx) {
		super();
		this.return_type = return_type;
		this.signature = signature;
		this.parameters = parameters;
		this.ctx = ctx;
	}

	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getReturn_type() {
		return return_type;
	}
	public void setReturn_type(String return_type) {
		this.return_type = return_type;
	}

	public ArrayList<Variable> getParameters() {
		return parameters;
	}

	public JuicyBoysParser.NormalClassDeclarationContext getContext() {
		return ctx;
	}

	public void setContext(JuicyBoysParser.NormalClassDeclarationContext ctx){
		this.ctx = ctx;
	}

	public void setParameters(ArrayList<Variable> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "\nFUNCTION return_type: " + return_type + " signature: " + signature  + " varlist: \n";
		for(int i = 0; i < parameters.size(); i++){
			result += parameters.get(i).toString();
		}
		return result;
	}



	*/
	
}
