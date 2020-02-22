package lt.sdaacademy.designpatterns.behavioral.visitor.example;

public interface Item {

    int accept(Visitor visitor);
}