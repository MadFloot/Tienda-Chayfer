package com.tiendachayfer.service.impl;

import com.tiendachayfer.dao.GiftcardsDao;
import com.tiendachayfer.domain.Giftcards;
import com.tiendachayfer.service.GiftcardsService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HUAWEI PC
 */
public class GiftcardsServiceImpl implements GiftcardsService{
    @Autowired
    private GiftcardsDao giftcardsDao;
    
    @Override
   @Transactional (readOnly=true)
   public List<Giftcards> getjuegos(boolean activos){
       var lista = giftcardsDao.findAll();
       if (activos) {
           lista.removeIf(e -> !e.isActivo());
       }
       return lista;
   }
   @Override
   @Transactional (readOnly=true)
   public List<Giftcards> getJuego (Giftcards giftcards){
       return (List<Giftcards>) giftcardsDao.findById(giftcards.getIdGiftcards()).orElse(null);
   }
   /*@Override
   @Transactional
   public void save(Giftcards giftcards){
       giftcardsDao.save(giftcards);
   }
   
   @Override
   @Transactional
   public void delete(Giftcards giftcards){
       giftcardsDao.delete(giftcards);
   }*/
}
