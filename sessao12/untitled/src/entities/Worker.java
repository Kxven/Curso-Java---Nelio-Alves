package untitled.src.entities;

import untitled.src.entities.enums.WorkerLevel;

import java.util.List;

public class Worker{
    private String name;
    private WorkerLevel level;
    private double BaseSalaty;

    private Department department;
    private List<HourContract> contracts;

    public Worker(){}

    public Worker( String name,WorkerLevel level,double baseSalaty,Department department ){
        this.name = name;
        this.level = level;
        BaseSalaty = baseSalaty;
        this.department = department;
    }

    //minuto 10 do exercicio de composição
}
