package net.moewes.todo;

import lombok.Data;

@Data
public class TaskItem {

  public TaskItem() {
    super();
    task = "Task";
  }

  private String task;
}
