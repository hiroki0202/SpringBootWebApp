package net.code;

import java.util.List;

public interface TrSellItemsService {

    public List<TrSellItemsEntity> findAll();
    public TrSellItemsEntity getOne(int id);
}
