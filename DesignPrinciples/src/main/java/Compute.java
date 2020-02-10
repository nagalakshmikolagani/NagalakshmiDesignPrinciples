public class Compute {
	Operation operation;
	public void setOperation(Operation operation)
	{
		this.operation=operation;
	}
	public int computeValue(int firstNumber,int secondNumber)
	{
	    return operation.calculateValue(firstNumber,secondNumber);
	}
}
