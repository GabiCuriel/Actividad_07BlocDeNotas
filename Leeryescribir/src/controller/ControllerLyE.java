package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelLyE;
import view.ViewLyE;

public class ControllerLyE implements ActionListener
{
    private final ModelLyE modelLyE;
    private final ViewLyE viewLyE;
    
    public ControllerLyE(ViewLyE viewLyE, ModelLyE modelLyE)    
    {
        this.viewLyE = viewLyE;
        this.modelLyE = modelLyE;
        viewLyE.jmi_leer.addActionListener(this);
        viewLyE.jmi_escribir.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewLyE.jmi_leer){
            modelLyE.setPath("C:\\Users\\gabii\\Documents\\ArchivoLE\\archivo.txt");
            modelLyE.readFile(modelLyE.getPath());      
            viewLyE.jta_txt.setText(modelLyE.getMessage());
        }else if(e.getSource()==viewLyE.jmi_escribir){
            modelLyE.setPath("C:\\Users\\gabii\\Documents\\ArchivoLE\\archivo.txt");
            modelLyE.setMessage(viewLyE.jta_txt.getText());
            modelLyE.writeFile(modelLyE.getPath(), modelLyE.getMessage());
        }
    }
    private void initView() 
    {
        viewLyE.setTitle("Archivo!");
        viewLyE.setResizable(false);
        viewLyE.setLocationRelativeTo(null);
        viewLyE.setVisible(true);
    }
}
       