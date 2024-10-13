package com.ps;

public class Transaction
{
    //Add Properties of transaction
    private String date;
    private String time;
    private String description;
    private String vendor;
    private double amount;

    public Transaction(double amount,
                       String date,
                       String description,
                       String time,
                       String vendor)
    {
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.time = time;
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
