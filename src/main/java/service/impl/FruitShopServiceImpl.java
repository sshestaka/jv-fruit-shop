package service.impl;

import java.util.List;
import model.FruitTransaction;
import service.FruitShopService;
import strategy.OperationStrategy;

public class FruitShopServiceImpl implements FruitShopService {
    private final OperationStrategy operationStrategy;

    public FruitShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void getFruitBalance(List<FruitTransaction> fruitTransactions) {
        for (var fruitTransaction : fruitTransactions) {
            operationStrategy.getOperation(fruitTransaction.getOperationType())
                    .handle(fruitTransaction);
        }
    }
}