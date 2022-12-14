package com.lld.carrental.model.reservation;

import com.lld.carrental.model.common.Address;
import com.lld.carrental.model.enums.ReservationStatus;
import com.lld.carrental.model.enums.VehicleReservationType;
import com.lld.carrental.model.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VehicleReservation {
    private String reservationId;
    private String usrId;
    private LocalDateTime reservationDate;
    private ReservationStatus status;
    private LocalDateTime fromDate;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private Address pickupLocation;
    private Address dropLocation;
    private double startMileage;
    private double endMileage;
    private String allocatedVehicleId;
    private VehicleType vehicleType;
    private String invoiceId;
    private VehicleReservationType vehicleReservationType;
}
