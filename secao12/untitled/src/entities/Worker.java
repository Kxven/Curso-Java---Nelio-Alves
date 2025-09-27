package entities;

import untitled.src.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker{
    private String name;
    private WorkerLevel level;
    private double BaseSalaty;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker( String name,WorkerLevel level,double baseSalaty,Department department ){
        this.name = name;
        this.level = level;
        this.BaseSalaty = baseSalaty;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel( WorkerLevel level ){
        this.level = level;
    }

    public double getBaseSalaty(){
        return BaseSalaty;
    }

    public void setBaseSalaty( double baseSalaty ){
        BaseSalaty = baseSalaty;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment( Department department ){
        this.department = department;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        return double;
    };
}
