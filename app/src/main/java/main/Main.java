package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;


public class Main {
    public static void main(String[] args) {
        //Project
        //ProjectController projectController = new ProjectController();
        //Project project = new Project();
        
        //Salvar
        /*project.setName("Projeto teste 1");
        project.setDescription("Descrição Teste 1");
        projectController.save(project);*/
        
        //Atualizar
        /*project.setId(1);
        project.setName("Novo nome do Projeto");
        project.setDescription("Nova Descrição");
        projectController.update(project);*/
        
        //Listar
        /*List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());*/
        
        //Deletar
        //projectController.removeById(2);
        
        /////////////////////////////////////////////////////////////////////////
        
        //TASK
        //TaskController taskController = new TaskController();
        //Task task = new Task();
        
        //Salvar
        /*task.setIdProject(1);
        task.setName("Criar tarefa 1-2");
        task.setDescription("Descrição tarefa 1-2");
        task.setNotes("Notas tarefas 1-2");
        task.setIsCompleted(true);
        task.setDeadline(new Date());
        taskController.save(task);*/
        
        //Atualizar
        /*task.setId(4);
        task.setIdProject(1);
        task.setName("Alterar nome tarefa");
        taskController.update(task);*/
        
        //Listar
        //List<Task> tasks = taskController.getAll(1);
        //System.out.println("Total de tarefas = " + tasks.size());
        
        //Deletar 
        //taskController.removeById(4);
    }
}
