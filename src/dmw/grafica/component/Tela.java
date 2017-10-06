/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmw.grafica.component;

import dmw.grafica.layout.BordaLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Diter Martim Wieser
 * @since 06/10/2017
 */
public class Tela extends JFrame implements BordaLayout {

    /**
     * 
     * @param title
     * @throws HeadlessException 
     */
    public Tela(String title) throws HeadlessException {
        super(title);
    }
    
    @Override
    public void setBottom(Component bottom) {
        add(bottom, BorderLayout.SOUTH);
    }

    @Override
    public void setCenter(Component center) {
        add(center, BorderLayout.CENTER);
    }

    @Override
    public void setLeft(Component left) {
        add(left, BorderLayout.WEST);
    }

    @Override
    public void setRignt(Component right) {
        add(right, BorderLayout.EAST);
    }

    @Override
    public void setTop(Component top) {
        add(top, BorderLayout.NORTH);
    }
    
    /**
     * 
     * @param frame 
     */
    protected void navegar(JFrame frame) {
        navegar(false, frame);
    }
    
    /**
     * 
     * @param visible
     * @param frame 
     */
    protected void navegar(boolean visible, JFrame frame) {
        navegar(visible, false, frame);
    }
    
    /**
     * 
     * @param visible
     * @param close
     * @param frame 
     */
    protected void navegar(boolean visible, boolean close, JFrame frame) {
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        if (!visible) {
            this.setVisible(false);
            if (close) {
                this.dispose();
            }
        }
    }
    
}
