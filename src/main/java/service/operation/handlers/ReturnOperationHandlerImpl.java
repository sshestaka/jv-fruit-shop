package service.operation.handlers;

public class ReturnOperationHandlerImpl implements OperationHandler {
    @Override
    public Integer getOperation() {
        return 1; //operation "RETURN" returns 1
    }
}
