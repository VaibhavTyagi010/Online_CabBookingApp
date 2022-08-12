package com.masai.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TripBooking {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @EqualsAndHashCode.Include
	   private Integer TripBookingId;
	   @NonNull
	   private Integer CustomerId; 
	   @ManyToOne
	   @NotNull(message = "{notNull}")
	   private Driver driver;
	  
	   @NotNull(message = "{From Location notNull}")
	   private String From_location;
	   
	   @NotNull(message = "{To Loccation notNull}")
	   private String To_location;
	   
	   
	    @FutureOrPresent(message = "{futOrPres}")
	    @NotNull(message = "{notNull}")
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private LocalDate Fromdate_time;
	    
	    
	    @FutureOrPresent(message = "{futOrPres}")
	    @NotNull(message = "{notNull}")
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private LocalDate Todate_time;
	   
       private Integer km;
	   @NonNull
       private Boolean Status;
       private Long  Totalamount;
       private Boolean Payment;
}
