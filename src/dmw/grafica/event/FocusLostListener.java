/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmw.grafica.event;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Diter Martim Wieser
 * @since 06/10/2017
 */
@FunctionalInterface
public interface FocusLostListener extends FocusListener {

    @Override
    public default void focusGained(FocusEvent e) { }

    @Override
    public void focusLost(FocusEvent e);
    
}
