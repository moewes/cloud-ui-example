package net.moewes.todo;

import javax.inject.Inject;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;

@CloudUiView("/todos")
public class TaskListView extends Div {

  @Inject
  public TaskListView(TaskRepository repository, CloudUi ui) {

    add(new H1("Todos"));

    repository.getTasks().forEach(item -> {
      Div taskItem = new Div();
      taskItem.setInnerHtml(item.getTask());
      add(taskItem);
    });

    UiComponent button = new UiComponent("button");
    button.setInnerHtml("Add Task");
    add(button);

    button.addEventListener("click", event -> {
      repository.setCurrentItem(new TaskItem());
      ui.navigate(AddTaskView.class);
    });

  }
}
