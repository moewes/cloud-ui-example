package net.moewes.cloud.ui.example.todo;

import java.util.UUID;
import javax.inject.Inject;
import net.moewes.cloud.ui.UiBinder;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;

@CloudUiView("/todos/add")
public class AddTaskView extends Div {

  @Inject
  public AddTaskView(TaskRepository repository, CloudUi ui) {

    add(new H1("Add Todo"));

    UiComponent taskField = new UiComponent("input");
    add(taskField);
    UiBinder binder = new UiBinder();
    repository.getCurrentItem().ifPresent(taskItem -> {
      binder.bind(taskField, taskItem::getTask, taskItem::setTask);
    });

    UiComponent saveButton = new UiComponent("button");
    saveButton.setInnerHtml("Save");
    saveButton.addEventListener("click", event -> {
      repository.getCurrentItem().ifPresent(taskItem -> {
        taskItem.setId(UUID.randomUUID());
        repository.addTask(taskItem);
      });
      ui.navigate(TaskListView.class);
    });

    add(saveButton);
  }
}
