package com.lld.carrental.model.reservation;

import com.lld.carrental.model.enums.ReservationStatus;
import com.lld.carrental.model.enums.VehicleReservationType;
import com.lld.carrental.model.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class VehicleInventory {
    private String id;
    private String reservationId;
    private LocalDateTime reservationDate;
    private ReservationStatus status;
    private LocalDateTime fromDate;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private double startMileage;
    private double endMileage;
    private Vehicle vehicle;
    private VehicleReservationType vehicleReservationType;

    public VehicleInventory() {
    }

    public VehicleInventory(VehicleReservation vehicleReservation,
                            Vehicle hireableVehicle) {
        this.id = UUID.randomUUID().toString();
        this.reservationId = vehicleReservation.getReservationId();
        this.reservationDate = vehicleReservation.getReservationDate();
        this.status = vehicleReservation.getStatus();
        this.fromDate = vehicleReservation.getFromDate();
        this.dueDate = vehicleReservation.getDueDate();
        this.returnDate = vehicleReservation.getReturnDate();
        this.startMileage = vehicleReservation.getStartMileage();
        this.endMileage = vehicleReservation.getEndMileage();
        this.vehicle = hireableVehicle;
        this.vehicleReservationType = vehicleReservation.getVehicleReservationType();
    }

    public VehicleInventory(Vehicle hireableVehicle) {
        this.id = UUID.randomUUID().toString();
        this.startMileage = hireableVehicle.getMileage();
        this.endMileage = hireableVehicle.getMileage();
        this.vehicle = hireableVehicle;
    }
}
