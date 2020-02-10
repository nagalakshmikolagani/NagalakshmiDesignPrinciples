public class Calculator {
	String operationType;
    public int computeCalculation(int firstNumber,int secondNumber,String operationType) throws Exception
    {
    	Compute compute=new Compute();
		this.operationType=operationType;
    	Class<?> cls=Class.forName(operationType);
		Object o=cls.newInstance();
		Operation computeOperation=(Operation)o;
		compute.setOperation(computeOperation);
		return compute.computeValue(firstNumber,secondNumber);
    }
}
