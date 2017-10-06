/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmw.grafica.layout;

import java.awt.Component;

/**
 *
 * @author Diter Martim Wieser
 * @since 06/10/2017
 */
public interface BordaLayout {
    
    /**
     * 
     * @param bottom 
     */
    void setBottom(Component bottom);
    
    /**
     * 
     * @param center 
     */
    void setCenter(Component center);

    /**
     * 
     * @param left 
     */
    void setLeft(Component left);
    
    /**
     * 
     * @param right 
     */
    void setRignt(Component right);
    
    /**
     * 
     * @param top 
     */
    void setTop(Component top);
}
