/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmw.grafica.component;

import dmw.grafica.event.FocusLostListener;
import javax.swing.JTextField;

/**
 *
 * @author Diter Martim Wieser
 * @since 06/10/2017
 */
public class CampoTexto extends JTextField {
    
    private static final int TAMANHO_PADRAO = 10;

    /**
     * 
     */
    public CampoTexto() {
        super(TAMANHO_PADRAO);
    }

    /**
     * 
     * @param columns 
     */
    public CampoTexto(int columns) {
        super(columns);
    }
    
    /**
     * 
     * @param listener 
     */
    public CampoTexto(FocusLostListener listener) {
        this();
        addFocusListener(listener);
    }
    
    /**
     * 
     * @param columns
     * @param listener 
     */
    public CampoTexto(int columns, FocusLostListener listener) {
        this(columns);
        addFocusListener(listener);
    }
    
    /**
     * 
     * @param editable 
     */
    public CampoTexto(boolean editable) {
        this();
        setEditable(editable);
    }
    
    /**
     * 
     * @param columns
     * @param editable 
     */
    public CampoTexto(int columns, boolean editable) {
        this(columns);
        setEditable(editable);
    }
    
    /**
     * 
     * @param editable
     * @param listener 
     */
    public CampoTexto(boolean editable, FocusLostListener listener) {
        this(listener);
        setEditable(editable);
    }
    
    /**
     * 
     * @param columns
     * @param editable
     * @param listener 
     */
    public CampoTexto(int columns, boolean editable, FocusLostListener listener) {
        this(columns, listener);
        setEditable(editable);
    }
}
