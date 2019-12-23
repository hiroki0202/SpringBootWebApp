package net.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrSellItemsServiceImpl implements TrSellItemsService {

    @Autowired
    private TrSellItemsRepository sellItemsRepository;

    public List<TrSellItemsEntity> findAll() {

        return sellItemsRepository.findAll();
    }

    public TrSellItemsEntity getOne(int id) {

        return sellItemsRepository.getOne(id);
    }
}

