package no.haakonjahre.restassured.model;

/**
 * Created by hakonj on 07/04/16.
 */
public class Todo {
    String todo;

    public Todo() {
    }

    public Todo(final String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }
}
