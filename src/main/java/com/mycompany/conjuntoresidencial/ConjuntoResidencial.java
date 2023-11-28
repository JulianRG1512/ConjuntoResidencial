

package com.mycompany.conjuntoresidencial;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.mycompany.conjuntoresidencial.igu.Principal;
import javax.swing.UIManager;


public class ConjuntoResidencial {

    public static void main(String[] args) {
       
        try {
           //UIManager.setLookAndFeel( new FlatLightLaf() );
           FlatArcDarkOrangeIJTheme.setup();
           UIManager.put( "Button.arc", 999 );
           UIManager.put( "TextComponent.arc", 999 );
           UIManager.put( "Component.arc", 999 );
                  
                    
        } catch( Exception ex ) {
          System.err.println( "Failed to initialize LaF" );
        }
        
        
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
}
