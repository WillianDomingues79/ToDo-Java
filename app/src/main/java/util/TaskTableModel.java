/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

//ESSA CLASSE IMPLEMENTA UM NOVO MODELO DE TABLE CUSTOMIZAVEL
//CONCEITO DE HERANÇA

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

//ABSTRACT TABLE MODEL = É o modelo de tabela customizável que pode ser implementado
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome","Descrição","Prazo","Tarefa Concluída","Editar","Excluir"};
    List<Task> tasks = new ArrayList();
    
    //Numero Linhas
    @Override
    public int getRowCount() {
        return tasks.size();
    }

    //Numero Colunas
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    //Pega os nomes das colunas para ser populado no switch case abaixo
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    //Deixa somente a coluna 3 editavel, CHECK
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;
    }
    
    //Metodo para retornar o tipo das variaveis, usado para o campo de CHECK virar clicavel
    //Se a tabela de tasks tive vazia, retorna só o objeto sem nada
    //Mas se estiver com itens, retorna o retorno deles que recebe do Switch, que no caso é a classe dele, tipo
    public Class<?> getColumnClass(int columnIndex){
        if(tasks.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    //Qual valor vai ser retornado na linha e coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados!";
        }
    }
    
    //Aqui tem uma conversão de tipos, para poder receber o valor boolean do Check
    //Nos parametros ele manda como Object faz o cast, converte para boolean e retorna novamente para Object
    //Ele vai fazer a troca de Check marcado ou não, mas precisa salvar no BD para ficar registrado
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
    }
    

    //GETTERS AND SETTERS
    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
