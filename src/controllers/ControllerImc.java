
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelImc;
import views.ViewImc;

public class ControllerImc implements ActionListener  {
      private ModelImc modelImc;
     private ViewImc viewImc;

    public ControllerImc(ModelImc modelImc, ViewImc viewImc) {
        this.modelImc = modelImc;
        this.viewImc = viewImc;
        this.viewImc.jb_mujer.addActionListener(this);
       this.viewImc.jb_hombre.addActionListener(this);
      
    }
     
     public void iniciar_vista(){
        viewImc.setLocationRelativeTo(null);
    }
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
        modelImc.setPeso(Double.parseDouble(viewImc.jtf_peso.getText()));
        modelImc.setEstatura(Double.parseDouble(viewImc.jtf_estatura.getText()));
        
   if(e.getSource()==viewImc.jb_mujer) modelImc.imcmujer();
   if(e.getSource()==viewImc.jb_hombre) modelImc.imchombre();
    
    
    
    viewImc.jl_resultado.setText(String.valueOf(modelImc.getImc()));
    
    
   
    }
    
    private void initComponets() {
         viewImc.setVisible(true);
        viewImc.setVisible(true);
    }
    
}
