package net.moewes.cloud.ui.example.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TaskRepository {

  private List<TaskItem> taskItems = new ArrayList<>();
  private TaskItem currentItem;

  public void addTask(TaskItem task) {
    taskItems.add(task);
  }

  public void deleteTask(TaskItem task) {
    taskItems.remove(task);
  }

  public List<TaskItem> getTasks() {
    return taskItems;
  }

  public Optional<TaskItem> getCurrentItem() {
    return Optional.ofNullable(currentItem);
  }

  public void setCurrentItem(TaskItem item) {
    currentItem = item;
  }
}
