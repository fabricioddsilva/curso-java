package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
    private LocalDate dueDate;
    private Double amount;

    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getDueDate().format(fmt) + " - " + String.format("%.2f", getAmount());
    }
}
