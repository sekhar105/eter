
package com.eter.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "employee_working_hrs")
@Data
@Entity
@ToString
@NoArgsConstructor
public class EmployeeWorkingHours {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String monday_st;
	
	private String monday_et;

	private String tuesday_st;
	
	private String tuesday_et;
	
	private String webnesday_st;
	
	private String webnesday_et;
	
	private String thrusday_st;
	
	private String thrusday_et;
	
	private String friday_st;
	
	private String friday_et;
	
	private String saturday_st;
	
	private String saturday_et;
	
	private String sunday_st;
	
	private String sunday_et;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	
	
}
