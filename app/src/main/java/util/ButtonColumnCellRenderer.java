package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ButtonColumnCellRenderer extends DefaultTableCellRenderer{
    private String buttonType;
    
    //CONSTRUTOR PARA SE BASEAR DECORAR BOTOES EDITAR E EXCLUIR
    //Usado para poder receber o nome da imagem na classe Main
    public ButtonColumnCellRenderer(String buttonType){
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
         JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
         label.setHorizontalAlignment(JLabel.CENTER);
         label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
         
         return label;
     }
     
}
