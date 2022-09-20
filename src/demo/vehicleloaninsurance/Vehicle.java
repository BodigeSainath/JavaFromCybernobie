package demo.vehicleloaninsurance;

public class Vehicle implements Loan,Insurance {
    private String vehicleNumber, modelNumber, vehicleType;
    private double price;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String vehicleNumber, String modelNumber, String vehicleType, double price) {
        this.vehicleNumber = vehicleNumber;
        this.modelNumber = modelNumber;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    @Override
    public double takeInsurance() {
        double eligibleLoan = 0;
        if (vehicleType.equalsIgnoreCase("4 wheeler")) {
            eligibleLoan = 80 * price / 100;
            return eligibleLoan;
        } else if (vehicleType.equalsIgnoreCase("3 wheeler")) {
            eligibleLoan = 75 * price / 100;
            return eligibleLoan;
        }
        if (vehicleType.equalsIgnoreCase("2 wheeler")) {
                eligibleLoan = 50 * price / 100;
            }
            return eligibleLoan;

    }

    @Override
    public double issueLoan() {
        double insuranceAmount = 0;
        if (price <= 150000) {
            insuranceAmount = 3500;
            return  insuranceAmount;
        } else if (price > 150000 && price < 300000) {
           insuranceAmount = 4000;
        return insuranceAmount;
        }
        if (price > 300000)
             insuranceAmount = 5000;
        return insuranceAmount;
    }
}
