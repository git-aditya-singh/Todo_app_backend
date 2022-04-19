package org.aditya.todo.todolistapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private String id;
    private String title;
    private String description;
    private String assigned;
    private String completed;
    private String created;
    private String updated;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssigned() {
        return this.assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getCompleted() {
        return this.completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", assigned='" + getAssigned() + "'" +
            ", completed='" + getCompleted() + "'" +
            ", created='" + getCreated() + "'" +
            ", updated='" + getUpdated() + "'" +
            "}";
    }
    
}
