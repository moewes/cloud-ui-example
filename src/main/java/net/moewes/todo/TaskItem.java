package net.moewes.todo;

import java.util.UUID;
import lombok.Data;

@Data
public class TaskItem {

  public TaskItem() {
    super();
    task = "Task";
  }

  private String task;
  private UUID id;
}
