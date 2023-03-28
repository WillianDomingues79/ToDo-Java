package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

//RENDERIZA (ALTERA) ESTÉTICA DA COLUNA PRAZOS
//Alinha data para o centro
public class DeadlineClumnCellRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(JLabel.CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        if(task.getDeadline().after(new Date())){
            label.setBackground(Color.GREEN);
        }else {
            label.setBackground(Color.red);
        }
        
        
        return label;
    }
}
