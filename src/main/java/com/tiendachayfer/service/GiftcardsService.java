package com.tiendachayfer.service;

import com.tiendachayfer.domain.Giftcards;
import java.util.List;

/**
 *
 * @author HUAWEI PC
 */
public interface GiftcardsService {
     //Listdo
    public List<Giftcards> getjuegos(boolean activos);
    //UN JUEGO
    public List<Giftcards> getJuego(Giftcards giftcards);
    
    //public void save(Giftcards giftcards);
    
    //public void delete(Giftcards giftcards);
    
}
