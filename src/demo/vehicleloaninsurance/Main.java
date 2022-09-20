package demo.vehicleloaninsurance;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
      String vNumber,mNum,vType;
      double price;
      Vehicle vehicle=new Vehicle("ts07","honda","4 wheeler",700000);
      vehicle.issueLoan();
      //vehicle.takeInsurance();
        StringJoiner stringJoiner=new StringJoiner(" ");
        stringJoiner.add(vehicle.getVehicleNumber())
                .add(vehicle.getModelNumber())
                .add(vehicle.getVehicleType())
                .add(String.valueOf( vehicle.getPrice()))
        .add(String.valueOf(vehicle.issueLoan()))
        .add(String.valueOf(vehicle.takeInsurance()));
      System.out.println(stringJoiner.toString());
    }
}
